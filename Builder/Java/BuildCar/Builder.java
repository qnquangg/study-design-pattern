/**
 * product construct steps which are common for all concrete builders.
 */
package BuildCar;

/**
 * @author nquang
 *
 */
public interface Builder {
	public void reset();
	public void setSeats(int number);
	public void setTripComputer(int tripComputer);
	public void setGPS();
}
