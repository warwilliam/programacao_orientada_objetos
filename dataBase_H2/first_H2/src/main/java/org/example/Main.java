package org.example;

import java.sql.*;

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS employee;"+
            "CREATE TABLE employee("+
            "id int PRIMARY KEY, "+
            "name VARCHAR(64), "+
            "corporation VARCHAR(64), "+
            "age int not null, "+
            "data_begin VARCHAR(32) not null);";

    private static final String SQL_INSERT1 = "INSERT INTO  employee " +
            "(id, name, corporation, age, data_begin) VALUES "+
            "(1, 'William', 'warcorporation', 36 , '09/09/2023');";

    private static final String SQL_INSERT2 = "INSERT INTO  employee " +
            "(id, name, corporation, age, data_begin) VALUES "+
            "(2, 'Ze', 'unbrellacorporation', 19 , '09/01/2023');";

    private static final String SQL_INSERT3 = "INSERT INTO  employee " +
            "(id, name, corporation, age, data_begin) VALUES "+
            "(3, 'Link', 'triforce', 55 , '09/09/2002');";



    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statement1 = connection.createStatement();
            statement1.execute(SQL_INSERT1);

            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT2);

            Statement statement3 = connection.createStatement();
            statement3.execute(SQL_INSERT3);

            String sqlSelectAll = "SELECT * FROM employee";
            Statement statement4 = connection.createStatement();
            ResultSet rs = statement4.executeQuery(sqlSelectAll);

            while (rs.next()){
                System.out.println(rs.getInt(1)
                +" | "+rs.getString(2)
                +" | "+rs.getString(3)
                +" | "+rs.getInt(4)
                +" | "+rs.getString(5));
            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("fechando a conexão");
            connection.close();
        }

    }

    public static Connection getConnection()throws Exception{
        return DriverManager.getConnection("jdbc:h2:mem:aula11", "sa","");
    }

}