package Decorator.PizzaMenu;

public abstract class Pizza {
    String name = "unknown name";
    String description = "unknow description";

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract int getCost();
}
