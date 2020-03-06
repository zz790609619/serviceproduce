package com.example.configclient.service;

import com.example.configclient.model.vo.User;

import java.util.List;

/**
 * @Author helloc
 * @Date 2020/3/2 10:54
 * @Version 1.0
 */
public interface UserService {
    /**
     * 根据id获取人
     * @param id
     * @return
     */
    List<User> getUserById(int id);

    List<User>findAll();

    List<User> findDistinctByUsername(String username);
}
