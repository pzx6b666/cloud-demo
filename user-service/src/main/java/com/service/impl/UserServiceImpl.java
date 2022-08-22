package com.service.impl;

import com.controller.model.User;
import com.dao.UserMapper;
import com.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public User getStudentById(String s) {
        return userMapper.getStudentById(s);
    }
}
