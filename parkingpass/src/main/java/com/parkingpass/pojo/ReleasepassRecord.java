package com.parkingpass.pojo;


public class ReleasepassRecord {
    private  Integer rpid;
    private  Integer quantity;  //申请数量
    private  Integer rid;       //放行条类型
    private  String applytime;    //申请时间
    private  String employtime;   //使用时间
    private  Integer status;    //状态
    private  Integer uid;       //用户id
    private  String desc;       //描述

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
