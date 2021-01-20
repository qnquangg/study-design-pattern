/**
 * provide implementations for all construction steps
 */
package BuildCar;

/**
 * @author nquang
 *
 */
public class CarBuilder implements Builder {

	private Car car;
	
	@Override
	public void reset() {
		System.out.println("reset this car");
		this.car = new Car();
	}

	@Override
	public void setSeats(int number) {
		System.out.println("set Seats for this car");
		this.car.setSeats(number);
	}

	@Override
	public void setTripComputer(int tripComputer) {
		System.out.println("set Trip Computer for this car");
		this.car.setTripComputer(tripComputer);
	}

	@Override
	public void setGPS() {
		System.out.println("set GPS for this car");
		this.car.setGps();
	}
	
	public Car getResult() {
		return this.car;
	}
}
