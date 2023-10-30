package org.example.dao.impl;

import org.example.dao.IDao;
import org.example.dao.config.ConfigJDBC;
import org.example.model.Address;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressDaoH2 implements IDao<Address> {

    private ConfigJDBC configJDBC;

    public AddressDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }


    @Override
    public Address save(Address address) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO address " +
                "(street, number, city, neighborhood) " +
                "VALUES ('%s', '%s', '%s', '%s')",
                address.getStreet(),
                address.getNumber(),
                address.getCity(),
                address.getNeghborhood()
        );

        try {

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next())
                address.setId(keys.getInt(1));
            statement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();

        }

        return address;
    }


}

