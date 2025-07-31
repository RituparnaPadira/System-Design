package org.example.strategy.drive;

public class AirDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving in air");
    }
}
