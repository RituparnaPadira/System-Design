package prac.com.factory;

import prac.com.vehicle.car.ToyotaCar;
import prac.com.vehicle.Vehicle;
import prac.com.vehicle.car.HyndaiCar;

public class CarFactory implements Factory{
    @Override
    public Vehicle getVehicle(String company) throws Exception {
        if(company.equals("hyundai")) {
            return new HyndaiCar();
        } else if (company.equals("toyota")) {
            return new ToyotaCar();
        }
        throw new Exception("Requested company car is not manufactured in car factory");
    }
}
