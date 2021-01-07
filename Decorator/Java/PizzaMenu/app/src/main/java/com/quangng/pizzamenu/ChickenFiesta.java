package com.quangng.pizzamenu;

public class ChickenFiesta extends Pizza {

    public ChickenFiesta() {
        name = "ChickenFiesta";
        description = "This is ChickenFiesta Pizza";
    }

    @Override
    public int getCost() {
        return 400;
    }
}
