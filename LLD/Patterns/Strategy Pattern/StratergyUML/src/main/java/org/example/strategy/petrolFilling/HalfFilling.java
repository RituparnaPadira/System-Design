package org.example.strategy.petrolFilling;

public class HalfFilling implements PetrolFillingStrategy{
    @Override
    public void fill() {
        System.out.println("Tank filled - 50%");
    }
}
