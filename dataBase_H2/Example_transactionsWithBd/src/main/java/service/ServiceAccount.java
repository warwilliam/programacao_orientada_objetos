package service;

import model.Account;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.*;

public class ServiceAccount {

    private static final Logger LOGGER = Logger.getLogger(ServiceAccount.class);

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS account; " +
            "CREATE TABLE account("+
            "id int PRIMARY KEY, "+
            "name VARCHAR(64), "+
            "numbAccount VARCHAR(64)," +
            "ammount double);";
    private static final String SQL_INSERT = "INSERT INTO account "
            +"(id, name, numbAccount, ammount) "
            +"VALUES (?, ?, ?, ?);";
    private static final String SQL_UPDATE = "UPDATE account SET ammount = ?" +
            " WHERE id = ?";
    public static void main(String[] args) throws SQLException {

        BasicConfigurator.configure();

        Account C1 = new Account(1,"Bill", "123456-7",0);

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Criando a tabela account");
            statement.execute(SQL_CREATE_TABLE);

            PreparedStatement insertAccount = connection.prepareStatement(SQL_INSERT);
            insertAccount.setInt(1, 1);
            insertAccount.setString(2,C1.getName());
            insertAccount.setString(3, C1.getNumbAccount());
            insertAccount.setDouble(4, C1.getAmmount());
            LOGGER.info("Inserindo a conta de Bill do BD");
            insertAccount.execute();

            showAccount(connection);

            PreparedStatement updateAccount = connection.prepareStatement(SQL_UPDATE);
            updateAccount.setDouble(1,10.00);
            updateAccount.setInt(2,1);
            updateAccount.execute();
            LOGGER.info("Depositando 10.00 na conta");
            showAccount(connection);

            PreparedStatement updateAccount2 = connection.prepareStatement(SQL_UPDATE);
            updateAccount2.setDouble(1,10.00 + takeAmmount(connection));
            updateAccount2.setInt(2,1);
            updateAccount2.execute();
            LOGGER.info("Depositando 10.00 na conta");
            showAccount(connection);

        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("Erro de acesso ao BD: "+e);

        }finally {
            connection.close();
        }
    }

    public static Connection getConnection()throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
    }

    public static void showAccount(Connection connection)throws Exception{
        String sqlSelect = "SELECT * FROM account;";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);

        while (rs.next()){
            System.out.println("ID: "+rs.getInt(1)
            +" Nome: "+ rs.getString(2)
            +" Conta: "+rs.getString(3)
            +" Saldo: "+rs.getDouble(4));
        }
    }

    public static double takeAmmount(Connection connection) throws Exception{
        String sqlAmmount = "SELECT ammount FROM account WHERE id = 1";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlAmmount);
        rs.next();
        double resp = rs.getDouble(1);
        return resp;
    }
}
