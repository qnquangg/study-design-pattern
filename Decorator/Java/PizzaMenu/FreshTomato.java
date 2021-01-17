package Decorator.PizzaMenu;

public class FreshTomato extends ToppingDecorator {

    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return "FreshTomato " + pizza.getName();
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
