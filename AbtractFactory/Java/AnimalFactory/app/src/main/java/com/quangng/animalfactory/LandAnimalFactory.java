package com.quangng.animalfactory;

public class LandAnimalFactory implements AnimalFactory {
    @Override
    public Animal getSeaAnimal(String name) {
        return null;
    }

    @Override
    public Animal getLandAnimal(String name) {
        switch (name) {
            case "Cat":
                return new Cat();
            case "Dog":
                return new Dog();
            default:
                return null;
        }
    }
}
