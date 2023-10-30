package com.war.firstSpring.Dao.impl;

import com.war.firstSpring.Dao.IDao;
import com.war.firstSpring.Dao.config.ConfigJDBC;
import com.war.firstSpring.model.Dentist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistDao implements IDao<Dentist> {

    private ConfigJDBC configJDBC;

    public DentistDao() {
        this.configJDBC = new ConfigJDBC();
    }


    @Override
    public Dentist save(Dentist dentist) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO dentist " +
                "(name, lastName, registration, isAgreement) " +
                "VALUES ('%s', '%s', '%s', '%s')",
                dentist.getName(),
                dentist.getLastName(),
                dentist.getRegistration(),
                dentist.getIsAgreement()
        );

        try {

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next()){
                dentist.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return dentist;
    }
    @Override
    public List<Dentist> searchAll() throws Exception {
        Connection connection = configJDBC.connectWithBD();
        PreparedStatement preparedStatement = null;
        String query = String.format("SELECT * FROM dentist");

        List<Dentist> dentists =  new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                dentists.add(createObjectDentist(rs));
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        return dentists;
    }


    @Override
    public Optional<Dentist> searchById(Integer id) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("SELECT * FROM dentist WHERE id = '%s'", id);

        Dentist dentist = null;

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                dentist = createObjectDentist(rs);
            }
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return dentist != null ? Optional.of(dentist) : Optional.empty();
    }

    @Override
    public void delete(Integer id) throws Exception {

        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("DELETE FROM dentist WHERE id = '%s'", id);

        try {

            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Dentist update(Dentist dentist) throws Exception {

        Connection connection = configJDBC.connectWithBD();
        String query = String.format(
                "UPDATE dentist SET name = '%s', lastName = '%s', registration = '%s', isAgreement = '%s'" +
                        "WHERE id = '%s'",
                dentist.getName(),
                dentist.getLastName(),
                dentist.getRegistration(),
                dentist.getIsAgreement(),
                dentist.getId());

        execute(connection, query);

        return dentist;
    }

    private void execute(Connection connection, String query) {

        PreparedStatement preparedStatement = null;

        try {

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();

            connection.close();
            preparedStatement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Dentist createObjectDentist(ResultSet rs) throws Exception {

        return new Dentist(
          rs.getInt("id"),
          rs.getString("name"),
          rs.getString("lastName"),
          rs.getInt("registration"),
          rs.getInt("isAgreement"));
    }

}
