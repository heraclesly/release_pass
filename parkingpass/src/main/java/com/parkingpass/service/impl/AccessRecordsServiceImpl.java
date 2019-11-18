package com.parkingpass.service.impl;

import com.parkingpass.mapper.AccessRecordsServiceMapper;
import com.parkingpass.pojo.AccessRecords;
import com.parkingpass.service.AccessRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccessRecordsServiceImpl implements AccessRecordsService {
    @Autowired
    private AccessRecordsServiceMapper releasepassLogMapper;


    @Override
    public String insert_message_ToRecord(AccessRecords accessRecords) {
        releasepassLogMapper.insert_message_ToRecord(accessRecords);
        return null;
    }

    @Override
    public List<AccessRecords> get_records_message(Long gid) {
        List<AccessRecords> list = releasepassLogMapper.get_records_message(gid);
        return list;
    }
}
