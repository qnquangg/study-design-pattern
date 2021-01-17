package Decorator.PizzaMenu;

public class main {

	public static void main(String[] args) {
		Pizza ChickenFiesta = new ChickenFiesta();
        Pizza freshTomatoChickenFiesta = new FreshTomato(ChickenFiesta);
        Pizza barbequeFreshTomatoChickenFiesta = new Barbeque(freshTomatoChickenFiesta);
        
        System.out.println(barbequeFreshTomatoChickenFiesta.getName() + ": " + barbequeFreshTomatoChickenFiesta.getCost());
	}

}
