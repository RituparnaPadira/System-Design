package org.example.basePizza;

public class VegDelight extends BasePizza{

    public VegDelight() {
        this.cost = 149;
    }

    @Override
    public void getBill() {
        System.out.println("Veg Delight Pizza - Rs 149");
    }
}
