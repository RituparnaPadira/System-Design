package org.example.vehicle;

import org.example.strategy.drive.AirDriveStrategy;
import org.example.strategy.drive.DriveStrategy;
import org.example.strategy.petrolFilling.HalfFilling;
import org.example.strategy.petrolFilling.PetrolFillingStrategy;

public class Aeroplane extends Vehicle{

    public Aeroplane() {
        driveStrategy = new AirDriveStrategy();
        fillingStrategy = new HalfFilling();
    }
}
