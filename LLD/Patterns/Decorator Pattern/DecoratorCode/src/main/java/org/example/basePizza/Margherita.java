package org.example.basePizza;

public class Margherita extends BasePizza{

    public Margherita() {
        this.cost = 100;
    }

    @Override
    public void getBill() {
        System.out.println("Margherita Pizza - Rs 100");
    }

}
