package com.parkingpass.service.impl;

import com.parkingpass.mapper.ReleasePassMapper;
import com.parkingpass.pojo.Releasepass;
import com.parkingpass.pojo.User;
import com.parkingpass.service.ReleasepassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleasePassServiceImpl implements ReleasepassService{
    @Autowired
    private ReleasePassMapper releasePassMapper;
    @Override
    public List<Releasepass> getAllReleasepassByUserId(User user) {
        List<Releasepass> releasepassList = releasePassMapper.getAllReleasepassByUserId(user);
        return releasepassList;
    }

    @Override
    public int updateReleasepass(Integer reid) {
        int result= releasePassMapper.updateReleasepass(reid);
        return result;
    }

    @Override
    public int updateReleasepassStatus(Integer uid) {
        int result= releasePassMapper.updateReleasepassStatus(uid);
        return result;
    }
}
