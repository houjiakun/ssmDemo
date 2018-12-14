package com.ssm.service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SystemService{

    @Autowired
    private UserDao userDao;


    public List<User> findUser(User user) {
        return userDao.findList(user);
    }


    public void insert(User user) {
        userDao.insert(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }


}
