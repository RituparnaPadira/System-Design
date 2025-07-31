package org.example.strategy.petrolFilling;

public class FullFilling implements PetrolFillingStrategy{

    @Override
    public void fill() {
        System.out.println("Tank filled - 100%");
    }
}
