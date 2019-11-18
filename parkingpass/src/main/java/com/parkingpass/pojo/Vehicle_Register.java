package com.parkingpass.pojo;

public class Vehicle_Register {
    private Integer vrid;
    private String licence_plate_number;    //车牌号
    private Integer reid;                   //放行条id
    private Integer uid;                    //用户id

    public Integer getVrid() {
        return vrid;
    }

    public void setVrid(Integer vrid) {
        this.vrid = vrid;
    }

    public String getLicence_plate_number() {
        return licence_plate_number;
    }

    public void setLicence_plate_number(String licence_plate_number) {
        this.licence_plate_number = licence_plate_number;
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
