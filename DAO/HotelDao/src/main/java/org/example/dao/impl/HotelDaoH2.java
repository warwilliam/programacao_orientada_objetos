package org.example.dao.impl;

import org.example.dao.IDao;
import org.example.dao.config.ConfigJDBC;
import org.example.model.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HotelDaoH2 implements IDao<Hotel> {

    private ConfigJDBC configJDBC;

    public HotelDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }



    @Override
    public Hotel save(Hotel hotel) {

        Connection connection = configJDBC.connectWithBD();
        Statement statement =  null;
        String query = String.format(
          "INSERT INTO hotel " +
                  "(name, street, number, city, state, is5stars) " +
                  "VALUES ('%s','%s','%s','%s','%s','%s')",
                hotel.getName(),
                hotel.getStreet(),
                hotel.getNumber(),
                hotel.getCity(),
                hotel.getState(),
                hotel.isIs5stars()
        );

        try {

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next())
                hotel.setId(keys.getInt(1));
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return hotel;
    }
}
