package prac.com;

import prac.com.factory.Factory;
import prac.com.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) throws Exception {
        // client wants a Hyundai car
        Factory factory = FactoryProvider.provideFactory("car");
        Vehicle myVehicle = factory.getVehicle("hyundai");
        myVehicle.drive();
    }
}