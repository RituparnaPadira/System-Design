package org.example.basePizza;

public abstract class BasePizza {
    protected int cost;

    public int getCost() {
        return this.cost;
    }

    public abstract void getBill();
}
