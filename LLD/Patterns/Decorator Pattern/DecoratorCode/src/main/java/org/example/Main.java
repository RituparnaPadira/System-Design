package org.example;

import org.example.basePizza.BasePizza;
import org.example.model.Topping;
import org.example.model.Base;

import static org.example.model.Topping.*;

public class Main {
    public static void main(String[] args) {
        OrderingSystem orderingSystem = new OrderingSystem();
        Topping[] toppings1 = {EXTRA_VEGGIES, EXTRA_CHEESE};
        try {
            BasePizza p1 = orderingSystem.getPizza(Base.MARGHERITA, toppings1);
        } catch (Exception e) {
            System.out.println("Exception : "+e);
        }
        System.out.println("--------------------------------------------------");
        Topping[] toppings2 = {EXTRA_VEGGIES, ONION, MUSHROOM};
        try {
            BasePizza p2 = orderingSystem.getPizza(Base.VEG_DELIGHT, toppings2);
        } catch (Exception e) {
            System.out.println("Exception : "+e);
        }
        System.out.println("--------------------------------------------------");
        Topping[] toppings3 = {EXTRA_VEGGIES, EXTRA_CHEESE, MUSHROOM};
        try {
            BasePizza p3 = orderingSystem.getPizza(Base.BBQ_CHICKEN, toppings3);
        } catch (Exception e) {
            System.out.println("Exception : "+e);
        }

    }
}