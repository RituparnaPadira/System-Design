package org.example;

import org.example.basePizza.BasePizza;
import org.example.basePizza.Margherita;
import org.example.basePizza.Peperoni;
import org.example.basePizza.VegDelight;
import org.example.basePizza.topping.ExtraCheese;
import org.example.basePizza.topping.ExtraVeggies;
import org.example.basePizza.topping.Mushroom;
import org.example.model.Base;
import org.example.model.Topping;

public class OrderingSystem {

    public BasePizza getPizza(Base base, Topping[] toppings) throws Exception {
        BasePizza pizza;
        if(base == Base.VEG_DELIGHT) {
            pizza = new VegDelight();
        } else if(base == Base.MARGHERITA) {
            pizza = new Margherita();
        } else if(base == Base.PEPERONI){
            pizza = new Peperoni();
        } else {
            throw new Exception("Base type "+base+" not available");
        }

        pizza.getBill();
        try {
            pizza = applyToppings(pizza, toppings, 0);
        } catch (Exception exp) {
            System.out.println("Exception caught: "+exp);
            throw exp;
        }
        System.out.println("Total Bill: Rs "+pizza.getCost());
        return pizza;
    }

    private BasePizza applyToppings(BasePizza pizza, Topping[] toppings, int i) throws Exception {
        if(toppings[i]==Topping.MUSHROOM) {
            pizza = new Mushroom(pizza);
        } else if(toppings[i]==Topping.EXTRA_CHEESE) {
            pizza = new ExtraCheese(pizza);
        } else if(toppings[i]==Topping.EXTRA_VEGGIES) {
            pizza = new ExtraVeggies(pizza);
        } else {
            throw new Exception("Topping "+toppings[i]+" is not available.");
        }

        pizza.getBill();
        if(i==toppings.length-1) {
            return pizza;
        }
        return applyToppings(pizza, toppings, i+1);
    }


}
