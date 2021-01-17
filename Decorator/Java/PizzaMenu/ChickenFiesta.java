package Decorator.PizzaMenu;

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
