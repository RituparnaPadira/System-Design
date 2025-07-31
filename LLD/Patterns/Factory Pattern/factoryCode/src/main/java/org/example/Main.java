package org.example;

import org.example.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) throws Exception{
        // client wants to drive a bike
        Vehicle myVehicle = Factory.getVehicle("bike");
        myVehicle.drive();
    }
}