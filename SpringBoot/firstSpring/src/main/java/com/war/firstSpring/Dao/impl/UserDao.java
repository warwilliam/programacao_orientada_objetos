package com.war.firstSpring.Dao.impl;

import com.war.firstSpring.Dao.IDao;
import com.war.firstSpring.Dao.config.ConfigJDBC;
import com.war.firstSpring.model.User;

import java.util.List;
import java.util.Optional;

public class UserDao implements IDao<User> {

    ConfigJDBC configJDBC;

    public UserDao(ConfigJDBC configJDBC) {
        this.configJDBC = new ConfigJDBC();
    }



    @Override
    public User save(User user) throws Exception {
        return null;
    }

    @Override
    public Optional searchById(Integer id) throws Exception {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) throws Exception {

    }

    @Override
    public List searchAll() throws Exception {
        return null;
    }

    @Override
    public User update(User user) throws Exception {
        return null;
    }

}
