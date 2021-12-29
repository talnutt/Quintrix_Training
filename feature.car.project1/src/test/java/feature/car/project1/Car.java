package feature.car.project1;

public class Car {
	private int odometer;
	private LargeEngine engine;
	private String model;
	
	public Car(String model) {
		this.model = model;
		this.engine = new LargeEngine();
	}

	int getOdometer() {
		return odometer;
	}

	public void Start() {
		this.engine.startEngine();
		
	}

}
