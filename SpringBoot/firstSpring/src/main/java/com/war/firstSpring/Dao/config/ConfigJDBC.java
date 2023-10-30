package com.war.firstSpring.Dao.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String username;
    private String password;


    public ConfigJDBC(String jdbcDriver, String dbUrl, String username, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.username = username;
        this.password = password;
    }

    public ConfigJDBC() {
        this.jdbcDriver = "com.mysql.cj.jdbc.Driver";
        this.dbUrl = "jdbc:mysql://localhost:3306/clinic";
        this.username = "root";
        this.password ="F@c@f0c@2020";
    }

    public Connection connectWithBD() throws Exception{

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(dbUrl, username, password);

        }catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }
}
