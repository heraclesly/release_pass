package com.parkingpass.mapper;

import com.parkingpass.pojo.AccessRecords;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccessRecordsServiceMapper {


        //向日志表插入数据
        public String insert_message_ToRecord(AccessRecords accessRecords);

        //获得日志记录
        public List<AccessRecords> get_records_message(Long gid);

}
