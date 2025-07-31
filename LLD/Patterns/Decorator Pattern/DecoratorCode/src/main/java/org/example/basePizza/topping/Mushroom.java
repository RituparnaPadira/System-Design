package org.example.basePizza.topping;

import org.example.basePizza.BasePizza;

public class Mushroom extends Topping{

    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
        this.cost = this.basePizza.getCost()+109;
    }

    @Override
    public void getBill() {
        System.out.println("Mushroom Topping - Rs 109");
    }
}
