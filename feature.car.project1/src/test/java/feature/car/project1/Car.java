package feature.car.project1;

public class Car extends Vehicle {
	private IEngine engine;
	private String model;
	
	public Car(String model, IEngine engine) {
		this.model = model;
		this.engine = engine;
	}


	public void Start() {
		this.engine.startEngine();
		
	}

}
