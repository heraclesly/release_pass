package com.parkingpass.mapper;

import com.parkingpass.pojo.ReleasepassRecord;
import com.parkingpass.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReleasePassRecordMapper {
    //获取该用户申请记录信息
    public List<ReleasepassRecord> getAllReleasepassRecordByUserId(User user);

    //添加用户提交放行条申请
    public int addReleasepassRecord(ReleasepassRecord releasepassRecord);

    //获取已审核的放行条
    public List<ReleasepassRecord> get_already_apply_release(Long status);

    //改变审核状态
    public void change_apply_status(int status);

}
