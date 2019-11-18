package com.parkingpass.service;

import com.parkingpass.pojo.ReleaseType;

import java.util.List;

public interface ReleaseTypeService {

    //获取该园区放行条类型
    public List<ReleaseType> getAllReleaseType(Long gid);
}
