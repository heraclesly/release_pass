package com.parkingpass.service;

import com.parkingpass.pojo.*;

import java.util.List;

public interface AccessRecordsService {

    //向日志表插入数据
    public String insert_message_ToRecord(AccessRecords accessRecords);

    //获得日志记录
    public List<AccessRecords> get_records_message(Long gid);
}