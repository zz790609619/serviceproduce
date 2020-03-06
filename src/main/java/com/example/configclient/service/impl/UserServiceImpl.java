package com.example.configclient.service.impl;

import com.example.configclient.dao.UserDao;
import com.example.configclient.model.vo.User;
import com.example.configclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author helloc
 * @Date 2020/3/2 10:55
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> getUserById(int id) {
        List<User>  users = userDao.findAllById(id);
        return users;
    }

    @Override
    public List<User> findAll() {
        List<User>  users = userDao.findAll();
        return users;
    }

    public List<User> findDistinctByUsername(String username) {
        List<User>  users = userDao.findDistinctByUsername(username);
        return users;
    }

}
