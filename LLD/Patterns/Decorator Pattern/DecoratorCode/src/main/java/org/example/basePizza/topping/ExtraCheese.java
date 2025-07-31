package org.example.basePizza.topping;

import org.example.basePizza.BasePizza;

public class ExtraCheese extends Topping{

    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
        this.cost = this.basePizza.getCost()+45;
    }

    @Override
    public void getBill() {
        System.out.println("Extra Cheese Topping - Rs 45");
    }
}
