package com.example.configclient.dao;

import com.example.configclient.model.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author helloc
 * @Date 2020/3/2 11:08
 * @Version 1.0
 */
public interface UserDao extends JpaRepository<User,Integer> {
    /**
     * 根据id获取人
     * @param id
     * @return
     */
    List<User> findAllById(int id);

    /**
     * 获取所有玩家列表
     * @return
     */
    @Override
    List<User> findAll();

    /**
     * 获取所有不重复的名字
     * @param username
     * @return
     */
    @Query(value = "select * from user where username=:username",nativeQuery = true)
    List<User> findDistinctByUsername(@Param("username") String username);
}
