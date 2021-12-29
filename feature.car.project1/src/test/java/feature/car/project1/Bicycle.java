package feature.car.project1;

public class Bicycle {

	private int odometer;

	public int getOdometer() {
		return this.odometer;
	}

	public void drive(int distance) {
		this.odometer += distance;
	}

}
