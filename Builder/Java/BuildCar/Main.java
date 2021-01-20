package BuildCar;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder carBuilder = new CarBuilder();
		
		director.makeSportsCar(carBuilder);
		Car car = carBuilder.getResult();
		System.out.print(car.getSeats());
		
	}

}
