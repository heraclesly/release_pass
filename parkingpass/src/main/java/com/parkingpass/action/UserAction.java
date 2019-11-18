package com.parkingpass.action;

import com.alibaba.fastjson.JSONObject;
import com.parkingpass.mapper.ReleaseTypeMapper;
import com.parkingpass.mapper.ReleasePassMapper;
import com.parkingpass.mapper.ReleasePassRecordMapper;
import com.parkingpass.mapper.VehicleRegisterMapper;
import com.parkingpass.pojo.*;
import com.parkingpass.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserAction {
    private static Logger logger= Logger.getLogger(UserAction.class); // 获取logger实例
    @Autowired
    private UserService userService;
    @Autowired
    private ReleaseTypeMapper releaseTypeMapper;
    @Autowired
    private ReleasePassMapper releasePassMapper;
    @Autowired
    private VehicleRegisterMapper vehicleRegisterMapper;
    @Autowired
    private ReleasePassRecordMapper releasePassRecordMapper;
    @CrossOrigin
    @ResponseBody
    @RequestMapping("/list")
    public List<User> login(){
        List<User> list = userService.UserLogin(new Long(1));
        return  list;
    }

    /**
     * 检测用户是否存在
     * 存在
     * 1.获取该用户企业信息
     * 2.获取该用户放行条信息
     * 3.获取该用户申请记录新
     * 不存在
     * 登记企业信息
     * 注册用户信息
     * @return
     */
    @RequestMapping("/user-detection")
    public  String  getUserMessage(/*@RequestBody JSONObject jsonObject*/){
        //JSONObject obj=jsonObject;
        String str ="成功";
        //用户信息校验
        User user = new User();
        user.setUser_number(1301603765);
        user.setUser_name("章邯");
        user.setEid(1);
        user.setGid(1);
        User users = userService.getUserMessage(user);
        if(user!=null){
            //
        }else{
            //
            Company company = new Company();
            company.setCompany_name("聘聘科技有限公司");
            company.setAddress("东亭业区218号");
            //添加企业信息
            //int result = userService.addCompany(company);
            //用户信息未存在 则登记用用户信息
            User user1 = new User();
            user1.setGid(1);
            user1.setUser_name("王杰");
            user1.setUser_number(1379644472);

        }


        return str;
    }
    @RequestMapping("/404")
    public  Integer testMessage(@RequestBody  Vehicle_Register vehicleRegister){
       return 404;
    }

    /**
     * 获取该企业用户所在园林的放行条类型
     * @param gid
     * @return
     */
    @ResponseBody
    @RequestMapping("/gain-releasetype")
    public String getReleaseType(HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        request.getSession().setAttribute("gid",1);
        request.getSession().setAttribute("uid",1);
        Long gid=1l;
        // 1  .获取该用户园区的放行条类型
        List<ReleaseType> list = releaseTypeMapper.getAllReleaseType(gid);
        jsonObject.put("tes",list);
        return  "successCallback("+jsonObject+")";
    }

    /**
     * 添加企业用户申请放行条信息
     * @param releasepassRecord申请信息
     * @return
     */
    @CrossOrigin
    @RequestMapping("/applyfor-releasepass")
    public String addReleasePass(ReleasepassRecord releasepassRecord,HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
         /* 3.  添加放行条申请
           ReleasepassRecord releasepassRecord = new  ReleasepassRecord();
           releasepassRecord.setQuantity(5);
           releasepassRecord.setRid(1);
           releasepassRecord.setApplytime(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-11"));
           releasepassRecord.setEmploytime(new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-12"));
           releasepassRecord.setStatus(0);
           releasepassRecord.setUid(1);*/
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        releasepassRecord.setApplytime(formatter.format(date));
        releasepassRecord.setUid((Integer) request.getSession().getAttribute("uid"));
        Integer  result =  releasePassRecordMapper.addReleasepassRecord(releasepassRecord);
        jsonObject.put("tess",result);
        return  "successCallback("+jsonObject+")";
    }

    /**
     * 获取企业用户拥有放行条信息
     * @param user用户信息
     * @return
     */
    @RequestMapping("/gainuser-releasepass")
    public String getUserReleasePass(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        User user = new User();
        user.setUid((Integer)request.getSession().getAttribute("uid"));
         /* 2 . 获取用户放行条信息
        User user = new User();
        user.setUid(new Long(1)); */
        //放行条过期改变状态
        Integer  result = releasePassMapper.updateReleasepassStatus((Integer) request.getSession().getAttribute("uid"));
        List<Releasepass> list = releasePassMapper.getAllReleasepassByUserId(user);
        jsonObject.put("list",list);
        return "successCallback("+jsonObject+")";
    }

    /**
     * 企业用户登记车辆使用放行条
     * @param vehicleRegister登记信息
     * @return
     */
    @RequestMapping("/vehicle-register")
    public String VehicleRegister(String vehiclenum,Integer reid,HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        Vehicle_Register vehicleRegister = new Vehicle_Register();
        vehicleRegister.setUid((Integer)request.getSession().getAttribute("uid"));
        vehicleRegister.setLicence_plate_number(vehiclenum);
        vehicleRegister.setReid(reid);
         /*登记车牌号使用放行条*/
        Integer result =vehicleRegisterMapper.addVehicleRegisterByUserId(vehicleRegister);
        if(result==1){
            Integer resultt= releasePassMapper.updateReleasepass(reid);
        }
        jsonObject.put("list",result);
        return "successCallback("+jsonObject+")";
    }

    /**
     * 获取企业用户申请放行条记录
     * @param user
     * @return
     */
    @RequestMapping("/gainuser-releasepassrecord")
    public  String getReleasepassRecord(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        User user = new User();
        user.setUid((Integer)request.getSession().getAttribute("uid"));
       /* 4. 获取用户放行条申请记录*/
        List<ReleasepassRecord> releasepassRecordList = releasePassRecordMapper.getAllReleasepassRecordByUserId(user);
        jsonObject.put("list",releasepassRecordList);
        return "successCallback("+jsonObject+")";
    }
}
