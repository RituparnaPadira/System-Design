package org.example.vehicle;

import org.example.strategy.drive.LandDriveStrategy;
import org.example.strategy.petrolFilling.FullFilling;

public class Bike extends Vehicle{

    public Bike() {
        driveStrategy = new LandDriveStrategy();
        fillingStrategy = new FullFilling();
    }
}
