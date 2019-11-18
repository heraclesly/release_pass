package com.parkingpass.pojo;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    private  Integer uid;            //用户id
    private  String user_image;     //用户头像信息
    private  String user_name;     //用户昵称
    private  Integer user_number; //用户号码
    private  Integer eid;        //企业id
    private  Integer gid;       //园区id

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_number() {
        return user_number;
    }

    public void setUser_number(Integer user_number) {
        this.user_number = user_number;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
}
