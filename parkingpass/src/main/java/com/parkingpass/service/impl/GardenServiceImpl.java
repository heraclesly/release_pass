package com.parkingpass.service.impl;

import com.parkingpass.mapper.GardenMapper;
import com.parkingpass.pojo.Company;
import com.parkingpass.pojo.Garden;
import com.parkingpass.service.GardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GardenServiceImpl implements GardenService{

    @Autowired
    private GardenMapper gardenMapper;


    @Override
    public Garden getGardenMessage(Garden garden) {
        Garden gd = gardenMapper.getGardenMessage(garden);
        return gd;
    }

    @Override
    public Company getCompanyMessage(Company company) {
        Company gy = gardenMapper.getCompanyMessage(company);
        return gy;
    }

    @Override
    public int addGardenUser(Garden garden) {
        int result = gardenMapper.addGardenUser(garden);
        return result;
    }

    @Override
    public int addCompany(Company company) {
        int result = gardenMapper.addCompany(company);
        return result;
    }
}
