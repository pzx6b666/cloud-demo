package com.controller;

import com.RemoteSyncService;
import com.controller.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RequestMapping(value ="/user")
@RestController
public class UserController {
   //12
    @Resource
    private RemoteSyncService remoteSyncService;

    @Value("${name}")
    private String name;


    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public String getUser(){

        User user= userService.getStudentById("1");
        System.out.println(user);
        String result = remoteSyncService.getOrder("111");
        return name;
    }


}
