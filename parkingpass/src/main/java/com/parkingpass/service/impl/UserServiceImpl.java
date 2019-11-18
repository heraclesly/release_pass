package com.parkingpass.service.impl;

import com.parkingpass.mapper.UserMapper;
import com.parkingpass.pojo.Company;
import com.parkingpass.pojo.User;
import com.parkingpass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> UserLogin(Long usernumber) {
        List<User> list = userMapper.login(usernumber);
        return list;
    }

    @Override
    public User getUserMessage(User user) {
        User userMessage = userMapper.getUserMessage(user);
        return userMessage;
    }

    @Override
    public int addUser(User user) {
        int result = userMapper.addUser(user);
        return result;
    }

}
