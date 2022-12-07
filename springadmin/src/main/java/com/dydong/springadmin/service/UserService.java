package com.dydong.springadmin.service;

import com.dydong.springadmin.mapper.UserMapper;
import com.dydong.springadmin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryUserByName(String username)
    {
        return userMapper.queryUserByName(username);
    }
}
