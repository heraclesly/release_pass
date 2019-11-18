package com.parkingpass.service;

import com.parkingpass.pojo.ReleasepassRecord;
import com.parkingpass.pojo.User;
import io.swagger.models.auth.In;

import java.util.List;

public interface ReleasepassRecordService {

    //获取该用户放行条申请记录信息
    public List<ReleasepassRecord> getAllReleasepassRecordByUserId(User user);

    //添加用户提交放行条申请
    public int addReleasepassRecord(ReleasepassRecord releasepassRecord);

    //获取已审核的放行条
    public List<ReleasepassRecord> get_already_apply_release(Long status);

    //改变审核状态
    public void change_apply_status(int status);

}
