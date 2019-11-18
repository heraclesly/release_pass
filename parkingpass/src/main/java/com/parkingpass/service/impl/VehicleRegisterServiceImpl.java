package com.parkingpass.service.impl;

import com.parkingpass.mapper.VehicleRegisterMapper;
import com.parkingpass.pojo.Vehicle_Register;
import com.parkingpass.service.VehicleRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleRegisterServiceImpl implements VehicleRegisterService{
    @Autowired
    private VehicleRegisterMapper vehicleRegisterMapper;
    @Override
    public int addVehicleRegisterByUserId(Vehicle_Register vehicleRegister) {
        int  result = vehicleRegisterMapper.addVehicleRegisterByUserId(vehicleRegister);
        return result;
    }
}
