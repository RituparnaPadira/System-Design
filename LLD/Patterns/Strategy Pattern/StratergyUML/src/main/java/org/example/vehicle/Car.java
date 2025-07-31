package org.example.vehicle;

import org.example.strategy.drive.LandDriveStrategy;
import org.example.strategy.petrolFilling.HalfFilling;

public class Car extends Vehicle{

    public Car() {
        driveStrategy = new LandDriveStrategy();
        fillingStrategy = new HalfFilling();
    }
}
