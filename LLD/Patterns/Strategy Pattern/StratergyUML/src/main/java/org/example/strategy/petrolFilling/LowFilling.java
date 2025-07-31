package org.example.strategy.petrolFilling;

public class LowFilling implements PetrolFillingStrategy{
    @Override
    public void fill() {
        System.out.println("Tank filled - 20%");
    }
}
