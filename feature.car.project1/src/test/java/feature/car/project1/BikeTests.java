package feature.car.project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BikeTests {

	@Test
	public void canDriveBike() {
		Bicycle bike = new Bicycle();
		int distance = 1;
		
		int odometerBefore = bike.getOdometer();
		bike.drive(distance);
		int odometerAfter = bike.getOdometer();
		
		assertEquals("odometer should increase by distance", distance, odometerBefore + distance);
	}

}
