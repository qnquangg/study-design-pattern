package BuildCar;

public class Car {
	private int seats;
	private int tripComputer;
	private int gps = 0;
	
	Car() {
	}
	
	public int setSeats(int seats) {
		return this.seats = seats;
	}
	
	public int setTripComputer(int tripComputer) {
		return this.tripComputer = tripComputer;
	}
	
	public int setGps() {
		return this.gps = 1;
	}
	
	public int getSeats() {
		return this.seats;
	}
	
	public int getTripComputer() {
		return this.tripComputer;
	}
	
	public int getGps() {
		return this.gps;
	}
}
