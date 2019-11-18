package com.parkingpass.pojo;

import java.util.Date;

public class Releasepass {
    private  Integer reid;  //放行条id
    private  Integer rid;   //放行条类型id 代表时长
    private  String  eleasepase_coding; //放行条编码
    private  String employtime;   //放行条使用日期
    private  Integer status;    //状态
    private  Integer uid;       //用户id

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getEleasepase_coding() {
        return eleasepase_coding;
    }

    public void setEleasepase_coding(String eleasepase_coding) {
        this.eleasepase_coding = eleasepase_coding;
    }

    public String getEmploytime() {
        return employtime;
    }

    public void setEmploytime(String employtime) {
        this.employtime = employtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
