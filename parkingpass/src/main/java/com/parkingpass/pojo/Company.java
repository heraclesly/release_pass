package com.parkingpass.pojo;

public class Company {

    private  Integer eid;
    private  String company_name; //企业名称
    private  String phone_call;  //联系电话
    private  String address;    //地址
    private  String license;    //营业执照
    private  String status;      //状态

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getPhone_call() {
        return phone_call;
    }

    public void setPhone_call(String phone_call) {
        this.phone_call = phone_call;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
