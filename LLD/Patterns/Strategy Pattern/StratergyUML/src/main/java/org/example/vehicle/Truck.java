package org.example.vehicle;

import org.example.strategy.drive.LandDriveStrategy;
import org.example.strategy.petrolFilling.LowFilling;

public class Truck extends Vehicle{

    public Truck() {
        driveStrategy = new LandDriveStrategy();
        fillingStrategy = new LowFilling();
    }
}
