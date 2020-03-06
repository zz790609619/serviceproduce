package com.example.configclient.model.dto;

import java.io.Serializable;

/**
 * @Author helloc
 * @Date 2020/3/2 11:16
 * @Version 1.0
 */
public class UserDto implements Serializable {
    private int id;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
