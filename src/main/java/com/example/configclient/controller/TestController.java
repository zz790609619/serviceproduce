package com.example.configclient.controller;

import com.alibaba.fastjson.JSON;
import com.example.configclient.model.dto.GoodsDto;
import com.example.configclient.model.dto.UserDto;
import com.example.configclient.model.vo.Goods;
import com.example.configclient.model.vo.User;
import com.example.configclient.service.GoodsService;
import com.example.configclient.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author helloc
 * @Date 2020/3/2 10:33
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserService userService;
    @Autowired
    GoodsService goodsService;
    @RequestMapping("/normal")
    public int getNormalBack(){
        return 0;
    }
    @PostMapping("/getListById")
    public String getNormalBack(@RequestBody UserDto userDto){
        List<User> userList=userService.getUserById(userDto.getId());
        String result= JSON.toJSONString(userList);
        return result;
    }
    @GetMapping("/findAll")
    public String getAllList(){
        List<User> userList=userService.findAll();
        String result= JSON.toJSONString(userList);
        return result;
    }
    @PostMapping("/getDistincByName")
    public String getDistincByName(@RequestBody UserDto userDto){
        List<User> userList=userService.findDistinctByUsername(userDto.getUsername());
        String result= JSON.toJSONString(userList);
        return result;
    }
    @PostMapping("/addGoods")
    public String addGoods(@RequestBody GoodsDto goodsDto){
        Goods goodsList=goodsService.addGoods(goodsDto);
        String result= JSON.toJSONString(goodsList);
        return result;
    }

}
