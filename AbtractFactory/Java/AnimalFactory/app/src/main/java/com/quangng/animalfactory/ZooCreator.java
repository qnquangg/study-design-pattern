package com.quangng.animalfactory;

public class ZooCreator {
    private AnimalFactory factory;
    private String type;

    public ZooCreator(String type) {
        this.type = type;

        switch (type) {
            case "Sea":
                this.factory = new SeaAnimalFactory();
            case "Land":
                this.factory = new LandAnimalFactory();
            default:
                break;
        }
    }

    public Animal getAnimal(String name) {
        switch (this.type) {
            case "Sea":
                return this.factory.getSeaAnimal(name);
            case "Land":
                return this.factory.getLandAnimal(name);
            default:
                return null;
        }
    }
}
