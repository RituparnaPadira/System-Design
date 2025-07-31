package org.example.vehicle;

import org.example.strategy.drive.WaterDriveStrategy;
import org.example.strategy.petrolFilling.LowFilling;

public class Ship extends Vehicle{

    public Ship() {
        driveStrategy = new WaterDriveStrategy();
        fillingStrategy = new LowFilling();
    }
}
