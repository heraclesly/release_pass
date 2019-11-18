package com.parkingpass.service;

import com.parkingpass.pojo.Company;
import com.parkingpass.pojo.Garden;

public interface GardenService {

    //检测管理用户是否存在
    public Garden getGardenMessage(Garden garden);

    //检测企业信息是否存在
    public Company getCompanyMessage(Company company);

    //添加管理用户
    public int addGardenUser(Garden garden);

    //添加企业信息
    public int addCompany(Company company);
}
