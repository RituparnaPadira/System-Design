package org.example.vehicle;

import org.example.strategy.drive.WaterDriveStrategy;
import org.example.strategy.petrolFilling.HalfFilling;

public class Boat extends Vehicle{

    public Boat() {
        driveStrategy = new WaterDriveStrategy();
        fillingStrategy = new HalfFilling();
    }
}
