package com.parkingpass.action;

import com.parkingpass.mapper.AccessRecordsServiceMapper;
import com.parkingpass.pojo.AccessRecords;
import com.parkingpass.pojo.ReleasepassRecord;
import com.parkingpass.service.AccessRecordsService;
import com.parkingpass.service.ReleasepassRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Admin_message {
    @Autowired
    private AccessRecordsService accessRecordsService;
    private ReleasepassRecordService releasepassRecordService;
    @GetMapping("/record/{gid}")
    public List<AccessRecords> get_records_message(@PathVariable("gid") Long gid) {

        try {
            List<AccessRecords> list = accessRecordsService.get_records_message(gid);
            return list;
        }catch (NullPointerException e){
            e.printStackTrace();

        }
        return null;
    }
    @RequestMapping("/setRecord")
    public String insert_message_ToRecord(AccessRecords accessRecords){
        AccessRecords accessRecords1 = new AccessRecords();
        accessRecords1.setEid(1);
        accessRecords1.setLicence_plate_number("粤AK7375");
        accessRecords1.setRelease_pase_coding("76738");
        accessRecords1.setEnter_time("2019-07-30 03:05:00");
        accessRecords1.setExit_time("2019-07-31 07:23:00");
        accessRecords1.setGid(1);
        accessRecordsService.insert_message_ToRecord(accessRecords1);
        String str = "success";
        return str;
    }

    @RequestMapping("/change_status/{status}")
    public void change_apply_status(@PathVariable("status") int status){
        ReleasepassRecord releasepassRecord = new ReleasepassRecord();
        releasepassRecord.setStatus(status);
    }

    @RequestMapping("/already_apply/{status}")
    public List<ReleasepassRecord> get_already_apply_release(@PathVariable("status") Long status){

        List<ReleasepassRecord> list = releasepassRecordService.get_already_apply_release(status);

        return list;
    }
}
