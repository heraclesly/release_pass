package com.parkingpass.service;

import com.parkingpass.pojo.Vehicle_Register;

public interface VehicleRegisterService {
    //企业用户登记车牌号时用放行条
    public int addVehicleRegisterByUserId(Vehicle_Register vehicleRegister);
}
