package feature.car.project1;

public class Car {
	private LargeEngine engine;
	private String model;
	
	public Car(String model) {
		this.model = model;
		this.engine = new LargeEngine();
	}


	public void Start() {
		this.engine.startEngine();
		
	}

}
