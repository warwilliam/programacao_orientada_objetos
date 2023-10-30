package com.war.firstSpring.resources.impl;

import com.war.firstSpring.resources.IDao;
import com.war.firstSpring.resources.config.ConfigJDBC;
import com.war.firstSpring.model.Address;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressDao implements IDao<Address> {

    private ConfigJDBC configJDBC;

    public AddressDao() {
        this.configJDBC = new ConfigJDBC();
    }

    @Override
    public Address save(Address address) throws Exception {

        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format(
          "INSERT INTO address " +
          "(street, number, city, neighborhood, state) " +
          "VALUES ('%s', '%s', '%s', '%s', '%s')",
          address.getStreet(),
          address.getNumber(),
          address.getCity(),
          address.getNeighborhood(),
          address.getState()
        );



        try {

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next()){
                address.setId(keys.getInt(1));
            }
            statement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

        return address;
    }

    @Override
    public List<Address> searchAll() throws Exception {
        Connection connection = configJDBC.connectWithBD();
        PreparedStatement preparedStatement = null;
        String query = String.format("SELECT * FROM address");

        List<Address> addresses =  new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                addresses.add(createObjectAddress(rs));
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        return addresses;
    }



    @Override
    public Optional<Address> searchById(Integer id) throws Exception {

        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("SELECT * FROM address WHERE id ='%s'",id);
        Address address = null;

        try {

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                address = createObjectAddress(rs);

            }

            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return address != null ? Optional.of(address) : Optional.empty();
    }

    @Override
    public void delete(Integer id) throws Exception {

        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("DELETE FROM address WHERE id ='%s'",id);

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
    public Address update(Address address) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        String query = String.format(
                "UPDATE address SET street = '%s', number = '%s', city = '%s', neighborhood = '%s', state = '%s'" +
                "WHERE id = '%s'",
                address.getStreet(),
                address.getNumber(),
                address.getCity(),
                address.getNeighborhood(),
                address.getState(),
                address.getId());

        execute(connection, query);

        return address ;
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

    private Address createObjectAddress(ResultSet rs) throws SQLException {
        return new Address(
                rs.getInt("id"),
                rs.getString("street"),
                rs.getString("number"),
                rs.getString("city"),
                rs.getString("neighborhood"),
                rs.getString("state")
        );
    }
}
