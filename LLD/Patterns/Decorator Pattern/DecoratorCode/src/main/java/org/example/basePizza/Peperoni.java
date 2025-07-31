package org.example.basePizza;

public class Peperoni extends BasePizza{

    public Peperoni() {
        this.cost = 129;
    }

    @Override
    public void getBill() {
        System.out.println("Peperoni Pizza - Rs 129");
    }

}
