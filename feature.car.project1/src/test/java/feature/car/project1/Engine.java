package feature.car.project1;

public abstract class Engine implements IEngine {
	protected int cylinderCount;

	public int getCylinderCount() {
		return this.cylinderCount;
	}
	
	public void startEngine() {
		System.out.println("Engine Started");
	}
}