package prac.com.factory;

import prac.com.vehicle.Vehicle;

public interface Factory {
    Vehicle getVehicle(String company) throws Exception;
}
