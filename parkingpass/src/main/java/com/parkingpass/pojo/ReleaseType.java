package com.parkingpass.pojo;

import java.io.Serializable;

public class ReleaseType implements Serializable {

    private Integer rid;//放行条id
    private Integer release_time; //放行条时间配置
    private String release_desc;//放行条描述
    private Integer gid;//园区id

    public Integer getRelease_time() {
        return release_time;
    }

    public void setRelease_time(Integer release_time) {
        this.release_time = release_time;
    }

    public String getRelease_desc() {
        return release_desc;
    }

    public void setRelease_desc(String release_desc) {
        this.release_desc = release_desc;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}
