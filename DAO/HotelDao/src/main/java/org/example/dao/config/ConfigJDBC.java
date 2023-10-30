package org.example.dao.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String userName;
    private String password;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String userName, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.userName = userName;
        this.password = password;
    }

    public ConfigJDBC() {
        this.jdbcDriver = "org.H2.Driver";
        this.dbUrl = "jdbc:h2:mem:checkpoint;" +
                "DB_CLOSE_DELAY=-1" +
                "INIT=RUNSCRIPT FROM 'create.sql'";
        this.userName = "sa";
        this.password = "";
    }

    public Connection connectWithBD(){
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(dbUrl,userName,password);

        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
