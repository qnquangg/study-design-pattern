package Decorator.PizzaMenu;

public class Jalapeno extends ToppingDecorator {

    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return "Jalapeno " + pizza.getName();
    }

    @Override
    public int getCost() {
        return 40 + pizza.getCost();
    }
}
