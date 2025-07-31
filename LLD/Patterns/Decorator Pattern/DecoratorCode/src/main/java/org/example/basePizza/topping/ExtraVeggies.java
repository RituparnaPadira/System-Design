package org.example.basePizza.topping;

import org.example.basePizza.BasePizza;

public class ExtraVeggies extends Topping{

    public ExtraVeggies(BasePizza pizza) {
        this.basePizza = pizza;
        this.cost = this.basePizza.getCost()+75;
    }

    @Override
    public void getBill() {
        System.out.println("Extra Veggies Topping - Rs 75");
    }
}
