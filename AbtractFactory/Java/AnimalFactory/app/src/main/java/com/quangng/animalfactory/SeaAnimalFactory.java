package com.quangng.animalfactory;

public class SeaAnimalFactory implements AnimalFactory {
    @Override
    public Animal getSeaAnimal(String name) {
        switch (name) {
            case "Octopus":
                return new Octopus();
            case "Shark":
                return new Shark();
            default:
                return null;
        }
    }

    @Override
    public Animal getLandAnimal(String name) {
        return null;
    }
}
