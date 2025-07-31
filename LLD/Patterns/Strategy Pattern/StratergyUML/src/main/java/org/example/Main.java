package org.example;

import org.example.vehicle.*;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle bike = new Bike();
        Vehicle aeroplane = new Aeroplane();
        car.driveVehicle();
        boat.driveVehicle();
        bike.driveVehicle();
        car.fillTank();
        bike.fillTank();
        aeroplane.driveVehicle();
    }
}