package org.example;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import javax.swing.plaf.nimbus.State;
import javax.xml.transform.Result;
import java.sql.*;

public class Program {
    static final Logger LOGGER = LogManager.getLogger(Program.class.getName());



    public static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS usuario;"+
            "CREATE TABLE usuario("+
            "id int PRIMARY KEY, "+
            "name VARCHAR(64), "+
            "lastname VARCHAR(64)," +
            "age int);";


    private static final String SQL_INSERT1 = "INSERT INTO usuario " +
            "(id, name, lastName, age) " +
            "VALUES" +
            "(1, 'William', 'Rodrigues', 36) ";

    private static final String SQL_INSERT2 = "INSERT INTO usuario " +
            "(id, name, lastName, age) " +
            "VALUES" +
            "(2, 'Natalia', 'Mosquetto', 36) ";

    private static final String SQLINSERT3 = "INSERT INTO usuario " +
            "(id, name, lastName, age) " +
            "VALUES" +
            "(3, 'Cherie', 'Rodrigues', 11) ";

    private static final String SQLINSERT4 = "INSERT INTO usuario " +
            "(id, name, lastName, age) " +
            "VALUES" +
            "(4, 'Pink', 'Rodrigues', 8) ";

    private static final String SQLINSERT5 = "INSERT INTO usuario " +
            "(id, name, lastName, age) " +
            "VALUES" +
            "(5, 'Cici', 'Rodrigues', 9) ";


    private static final String SQLDELETE = "DELETE FROM usuario WHERE id = 5";

    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            LOGGER.info("tabela criada");
            statement.execute(SQL_INSERT1);
            statement.execute(SQL_INSERT2);
            statement.execute(SQLINSERT3);
            statement.execute(SQLINSERT4);
            statement.execute(SQLINSERT5);
            LOGGER.info("lendo os dados");
            showUsers(connection);
            deleteUser(connection,2);
            showUsers(connection);

        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("Erro no bloco try: "+e);
        }finally {
            connection.close();
            LOGGER.info("fechando a conexao");
        }

    }

    public static Connection getConnection()throws Exception{
        return DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
    }

    public static void showUsers(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM usuario";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);

        while (rs.next()){
            System.out.println(rs.getInt(1)
            +" | "+rs.getString(2)
            +" | "+rs.getString(3)
            +" | "+rs.getInt(4));
        }

    }

    public static void deleteUser(Connection connection, int id ) throws SQLException {
        String sqlDelete = """
        DELETE FROM usuario WHERE id = ?
        """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
        preparedStatement.setInt(1,id);
        preparedStatement.execute();

    }

}