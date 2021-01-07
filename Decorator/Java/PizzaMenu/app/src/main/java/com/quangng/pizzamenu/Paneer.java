package com.quangng.pizzamenu;

public class Paneer extends ToppingDecorator {

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getName() {
        return "Paneer " + pizza.getName();
    }

    @Override
    public int getCost() {
        return 30 + pizza.getCost();
    }
}
