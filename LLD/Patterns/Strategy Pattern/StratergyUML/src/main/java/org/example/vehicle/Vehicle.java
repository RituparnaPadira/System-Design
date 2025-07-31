package org.example.vehicle;

import org.example.strategy.drive.DriveStrategy;
import org.example.strategy.petrolFilling.PetrolFillingStrategy;

public abstract class Vehicle {

    DriveStrategy driveStrategy;
    PetrolFillingStrategy fillingStrategy;

    public void driveVehicle() {
        driveStrategy.drive();
    }
    public void fillTank() {
        fillingStrategy.fill();
    }
}
