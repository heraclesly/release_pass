package com.parkingpass.mapper;

import com.parkingpass.pojo.ReleaseType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReleaseTypeMapper {
    //获取用户该园区放行条类型
    public List<ReleaseType> getAllReleaseType(Long gid);
}
