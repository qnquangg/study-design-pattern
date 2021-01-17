package Decorator.PizzaMenu;

public class Margheritta extends Pizza {

    public Margheritta() {
        name = "Margheritta";
        description = "This is Margheritta Pizza";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
