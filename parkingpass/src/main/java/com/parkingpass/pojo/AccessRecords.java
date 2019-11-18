package com.parkingpass.pojo;

public class AccessRecords {

    private Integer eid;
    private String licence_plate_number;
    private String release_pase_coding;
    private String enter_time;
    private String exit_time;
    private Integer gid;
    private String company_name;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getLicence_plate_number() {
        return licence_plate_number;
    }

    public void setLicence_plate_number(String licence_plate_number) {
        this.licence_plate_number = licence_plate_number;
    }

    public String getRelease_pase_coding() {
        return release_pase_coding;
    }

    public void setRelease_pase_coding(String release_pase_coding) {
        this.release_pase_coding = release_pase_coding;
    }

    public String getEnter_time() {
        return enter_time;
    }

    public void setEnter_time(String enter_time) {
        this.enter_time = enter_time;
    }

    public String getExit_time() {
        return exit_time;
    }

    public void setExit_time(String exit_time) {
        this.exit_time = exit_time;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
}
