package org.example;

import org.example.vehicle.Bike;
import org.example.vehicle.Car;
import org.example.vehicle.Vehicle;

public class Factory {

    public static Vehicle getVehicle(String vehicleType) throws Exception{
        if(vehicleType.equals("car")) {
            return new Car();
        } else if(vehicleType.equals("bike")) {
            return new Bike();
        }
        throw new Exception("Vehicle of required type not found");
    }
}
