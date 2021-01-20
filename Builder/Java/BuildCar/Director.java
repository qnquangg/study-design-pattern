/**
 * 
 */
package BuildCar;

/**
 * @author nquang
 *
 */
public class Director {
	public Director() {
	}
	
	public void makeSportsCar(Builder builder) {
		builder.reset();
		builder.setSeats(4);
		builder.setGPS();
	}
	
	public void makeManual(Builder builder) {
		builder.reset();
		builder.setSeats(4);
		builder.setGPS();
		builder.setTripComputer(3);
	}
	
	public void makeAutoCar() {
		// todo
	}
}
