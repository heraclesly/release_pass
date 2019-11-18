package com.parkingpass.mapper;

import com.parkingpass.pojo.Vehicle_Register;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VehicleRegisterMapper {
    //添加车辆登记信息
    public int addVehicleRegisterByUserId(Vehicle_Register vehicleRegister);
}
