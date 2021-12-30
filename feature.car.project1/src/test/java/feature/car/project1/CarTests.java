package feature.car.project1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		String model = "Corvette";
		
		Car car = new Car("Corvette", new LargeEngine());
		car.Start();
		
		Assert.assertTrue (car != null);
	}

	@Test
	public void canDriveCar() {
		Car car = new Car("Corvette");
		int distance = 1;
		
		int odometerBefore = car.getOdometer();
		car.drive(distance);
		int odometerAfter = car.getOdometer();
		
		assertEquals("odometer should increase by distance", distance, odometerBefore + distance);
	}
	
	@Test
	public void enginesHaveCorrectCylinderCount() {
		int smallEngineCylinderCount = 4;
		int largeEngineCylinderCount = 8;
		
		SmallEngine smallEngine = new SmallEngine();
		LargeEngine largeEngine = new LargeEngine();
		
		int actualSmallEngineCylinderCount = smallEngine.getCylinderCount();
		int actualLargeEngineCylinderCount = largeEngine.getCylinderCount();
		
		assertTrue("cylinder counts should match as expected.", smallEngineCylinderCount == actualSmallEngineCylinderCount);
		assertTrue("cylinder counts should match as expected.", largeEngineCylinderCount == actualLargeEngineCylinderCount);
		
	}
	
}
