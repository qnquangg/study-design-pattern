package com.quangng.pizzamenu;

public class FarmHouse extends Pizza {

    public FarmHouse() {
        name = "Farm House";
        description = "This is Farm House pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
