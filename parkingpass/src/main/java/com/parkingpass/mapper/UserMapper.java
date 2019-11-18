package com.parkingpass.mapper;

import com.parkingpass.pojo.Company;
import com.parkingpass.pojo.Garden;
import com.parkingpass.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> login(Long usernumber);

    //查询企业用户是否存在
    public User getUserMessage(User user);

    //添加企业用户
    public int addUser(User user);
}
