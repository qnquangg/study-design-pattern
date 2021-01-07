package com.quangng.pizzamenu;

public class PeppyPaneer extends Pizza {
    
    public PeppyPaneer() {
        name = "Peppy Paneer";
        description = "This is Peppy Paneer pizza";
    }
    
    @Override
    public int getCost() {
        return 100;
    }
}
