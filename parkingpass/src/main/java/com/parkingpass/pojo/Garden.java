package com.parkingpass.pojo;

public class Garden {
    private  Integer gid;
    private  Long garden_number;
    private  String garden_name;
    private  String garden_desc;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Long getGarden_number() {
        return garden_number;
    }

    public void setGarden_number(Long garden_number) {
        this.garden_number = garden_number;
    }

    public String getGarden_name() {
        return garden_name;
    }

    public void setGarden_name(String garden_name) {
        this.garden_name = garden_name;
    }

    public String getGarden_desc() {
        return garden_desc;
    }

    public void setGarden_desc(String garden_desc) {
        this.garden_desc = garden_desc;
    }
}
