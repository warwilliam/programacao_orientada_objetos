package com.war.firstSpring.service;

import com.war.firstSpring.resources.IDao;
import com.war.firstSpring.model.User;

import java.util.List;
import java.util.Optional;

public class UserService {

    public IDao<User> userIDao;

    public UserService(IDao<User> userIDao) {
        this.userIDao = userIDao;
    }

    public User save(User user) throws Exception {
       return userIDao.save(user);
    }

    public List<User> takeAllUsers() throws Exception {
       return userIDao.searchAll();
    }

    public void deletebyId(Integer id) throws Exception {
        userIDao.delete(id);
    }

    public Optional<User> searchbyId(Integer id) throws Exception {
        return userIDao.searchById(id);
    }

    public User updateUser(User user) throws Exception {
        return userIDao.update(user);
    }
}
