package org.example.strategy.drive;

public class WaterDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Driving on water");
    }
}
