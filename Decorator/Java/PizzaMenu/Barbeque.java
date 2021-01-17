package Decorator.PizzaMenu;

public class Barbeque extends ToppingDecorator {

    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return "Barbeque " + pizza.getName();
    }

    @Override
    public int getCost() {
        return 50 + pizza.getCost();
    }
}
