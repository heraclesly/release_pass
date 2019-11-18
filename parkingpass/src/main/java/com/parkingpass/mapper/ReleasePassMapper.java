package com.parkingpass.mapper;

import com.parkingpass.pojo.Releasepass;
import com.parkingpass.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReleasePassMapper {
    //获取用户拥有的放行条信息
    public List<Releasepass> getAllReleasepassByUserId(User user);
    //放行条登记已使用
    public int updateReleasepass(Integer reid);
    //放行条过期改变状态
    public int updateReleasepassStatus(Integer uid);
}
