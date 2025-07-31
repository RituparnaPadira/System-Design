package org.example.strategy.drive;

public class LandDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving on land");
    }
}
