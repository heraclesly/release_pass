package com.parkingpass.service;

import com.parkingpass.pojo.Company;
import com.parkingpass.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> UserLogin(Long usernumber);
    //查询用户是否存在
    public User getUserMessage(User user);
    //新增用户
    public int addUser(User user);
}
