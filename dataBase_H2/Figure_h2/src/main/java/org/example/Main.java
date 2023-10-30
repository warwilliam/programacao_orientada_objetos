package org.example;

import java.sql.*;

public class Main {

    public static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS figure;"+
            "CREATE TABLE figure("+
            "id int PRIMARY KEY, "+
            "name VARCHAR(64), "+
            "color VARCHAR(64));";

    private static final String SQL_INSERT1 = "INSERT INTO figure "+
            "(id, name, color) VALUES "+
            "(1, 'circulo', 'vermelho');";

    private static final String SQL_INSERT2 = "INSERT INTO figure "+
            "(id, name, color) VALUES "+
            "(2, 'circulo', 'azul');";

    private static final String SQL_INSERT3 = "INSERT INTO figure "+
            "(id, name, color) VALUES "+
            "(3, 'square', 'vermelho');";

    private static final String SQL_INSERT4 = "INSERT INTO figure "+
            "(id, name, color) VALUES "+
            "(4, 'square', 'azul');";

    private static final String SQL_INSERT5 = "INSERT INTO figure "+
            "(id, name, color) VALUES "+
            "(5, 'square', 'vermelho');";

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {

            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT1);

            Statement statement3 = connection.createStatement();
            statement3.execute(SQL_INSERT2);

            Statement statement4 = connection.createStatement();
            statement4.execute(SQL_INSERT3);

            Statement statement5 = connection.createStatement();
            statement5.execute(SQL_INSERT4);

            Statement statement6 = connection.createStatement();
            statement6.execute(SQL_INSERT5);

            String sqlConsult = "SELECT * FROM figure" +
                    " WHERE name = 'circulo'" +
                    " AND color = 'vermelho'";

            Statement statementSelect = connection.createStatement();
            ResultSet rs = statementSelect.executeQuery(sqlConsult);

            while (rs.next()){
                System.out.println(rs.getInt(1)+" | "+ rs.getString(2)+" | "+rs.getString(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando conexão");
            connection.close();
        }
    }

    public static Connection getConnection()throws Exception{
        return DriverManager.getConnection("jdbc:h2:mem:test", "sa","");
    }
}