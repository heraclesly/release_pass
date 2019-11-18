package com.parkingpass.service.impl;

import com.parkingpass.mapper.ReleasePassRecordMapper;
import com.parkingpass.pojo.ReleasepassRecord;
import com.parkingpass.pojo.User;
import com.parkingpass.service.ReleasepassRecordService;
import com.parkingpass.service.ReleasepassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReleasepassRecordServiceImpl implements ReleasepassRecordService {
    @Autowired
    private ReleasePassRecordMapper releasePassRecordMapper;
    @Override
    public List<ReleasepassRecord> getAllReleasepassRecordByUserId(User user) {
        List<ReleasepassRecord> releasepassRecordList = releasePassRecordMapper.getAllReleasepassRecordByUserId(user);
        return releasepassRecordList;
    }

    @Override
    public int addReleasepassRecord(ReleasepassRecord releasepassRecord) {
        int result = releasePassRecordMapper.addReleasepassRecord(releasepassRecord);
        return result;
    }

    @Override
    public List<ReleasepassRecord> get_already_apply_release(Long status) {
        List<ReleasepassRecord> list = releasePassRecordMapper.get_already_apply_release(status);
        System.out.println("11111");
        return null;
    }

    @Override
    public void change_apply_status(int status) {
        releasePassRecordMapper.change_apply_status(status);
    }


}
