package com.parkingpass.service.impl;

import com.parkingpass.mapper.ReleaseTypeMapper;
import com.parkingpass.pojo.ReleaseType;
import com.parkingpass.service.ReleaseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleaseTypeServiceImpl implements ReleaseTypeService{
    @Autowired
    private ReleaseTypeMapper releaseTypeMapper;
    @Override
    public List<ReleaseType> getAllReleaseType(Long gid) {
        List<ReleaseType> releaseTypeList =  releaseTypeMapper.getAllReleaseType(gid);
        return releaseTypeList;
    }
}
