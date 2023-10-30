package com.war.firstSpring.resources.impl;

import com.war.firstSpring.resources.IDao;
import com.war.firstSpring.resources.config.ConfigJDBC;
import com.war.firstSpring.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements IDao<User> {

    ConfigJDBC configJDBC;

    public UserDao() {
        this.configJDBC = new ConfigJDBC();
    }



    @Override
    public User save(User user) throws Exception {
        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("INSERT INTO user (name, email, password, accessLevel) VALUES ('%s', '%s', '%s', '%s')",
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getAccessLevel());

        try {

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            while (keys.next()){
                user.setId(keys.getInt(1));
            }
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List searchAll() throws Exception {
        List<User> userList = new ArrayList<>();
        Connection connection = configJDBC.connectWithBD();
        PreparedStatement preparedStatement = null;
        String query = String.format("SELECT * FROM user");
        ResultSet rs = preparedStatement.executeQuery(query);

        while (rs.next()){
            userList.add(createObjectUser(rs));
        }
        preparedStatement.close();
        connection.close();


        return userList;
    }

    @Override
    public Optional searchById(Integer id) throws Exception {
        User user = null;
        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("SELECT * FROM user WHERE id = '%s'", id);

        try {

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                user = createObjectUser(rs);
            }
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return user != null ? Optional.of(user) : Optional.empty();
    }

    @Override
    public void delete(Integer id) throws Exception {

        Connection connection = configJDBC.connectWithBD();
        Statement statement = null;
        String query = String.format("DELETE FROM user WHERE id = '%s'",id);

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
    public User update(User user) throws Exception {

        Connection connection = configJDBC.connectWithBD();
        String query = String.format("UPDATE user SET name = '%s', email = '%s', password = '%s', accessLevel = '%s' WHERE id = '%s'",
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getAccessLevel());

        execute(connection, query);

        return user;
    }

    private void execute(Connection connection, String query) throws SQLException {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private User createObjectUser(ResultSet rs) throws SQLException {

        return  new User(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("password"),
                rs.getInt("accessLevel")
        );

    }

}
