package com.war.firstSpring.resources.impl;

import com.war.firstSpring.resources.IDao;
import com.war.firstSpring.resources.config.ConfigJDBC;
import com.war.firstSpring.model.Address;
import com.war.firstSpring.model.Patient;
import com.war.firstSpring.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PatientDao implements IDao<Patient> {

     private ConfigJDBC configJDBC;
    private AddressDao addressDao;

    public PatientDao(AddressDao addressDao) {
        this.configJDBC = new ConfigJDBC();
        this.addressDao = new AddressDao();
    }

    @Override
    public Patient save(Patient patient) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        PreparedStatement preparedStatement = null;

        patient.setAddress(addressDao.save(patient.getAddress()));

        String query = String.format("INSERT INTO patient " +
                "(name, last_name, cpf, date_reg, id_address) " +
                "VALUES ('%s', '%s', '%s', '%s', '%s')",
                patient.getName(),
                patient.getLast_name(),
                patient.getCpf(),
                Util.datetimestamp(patient.getDate_reg()),
                patient.getAddress().getId());

        try {

            preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();

            if (keys.next()){
                patient.setId(keys.getInt(1));
            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return patient;
    }

    @Override
    public Optional<Patient> searchById(Integer id) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("SELECT * FROM patient WHERE id = '%s'", id);
        Patient patient = null;

        try {

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                patient = createObjectPatient(rs);
            }
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return patient != null ? Optional.of(patient) : Optional.empty();
    }


    @Override
    public void delete(Integer id) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("DELETE FROM patient WHERE id = '%s'", id);

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Patient> searchAll() throws Exception {
        Connection connection = configJDBC.connectWithBD();
        PreparedStatement preparedStatement= null;
        String query = "SELECT * FROM patient;";

        List<Patient> patients = new ArrayList<>();

        try {

            preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                patients.add(createObjectPatient(rs));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return patients;
    }

    @Override
    public Patient update(Patient patient) throws Exception {

        Connection connection = configJDBC.connectWithBD();

        if (patient.getAddress() != null && patient.getId() != null){
            addressDao.update(patient.getAddress());
        }

        String query = String.format(
          "UPDATE patient SET name = '%s', last_name = '%s', cpf = '%s' WHERE id = '%s'",
                patient.getName(),
                patient.getLast_name(),
                patient.getCpf(),
                patient.getId());

        execute(connection,query);

        return patient;
    }

    private void execute(Connection connection, String query) {

        try {

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Patient createObjectPatient(ResultSet rs) throws Exception {
        Integer id = rs.getInt("id");
        String name = rs.getString("name");
        String last_name = rs.getString("last_name");
        String cpf = rs.getString("cpf");
        Date date_reg = rs.getDate("date_reg");
        Address address = addressDao.searchById( rs.getInt("id_address")).orElse(null);

        return new Patient(id, name, last_name, cpf, date_reg, address);
    }

}


//aula 27