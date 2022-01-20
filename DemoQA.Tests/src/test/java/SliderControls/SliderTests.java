package SliderControls;

import org.testng.annotations.Test;

import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SliderTests extends TestBase{

	@Test
	public void canSetSliderValues() {

		final String url = "https://demoqa.com/slider";
		getDriver().navigate().to(url);
		Slider slider = new Slider(getDriver());
		slider.setValue("80");
		Assert.assertEquals(slider.getValue(), "80");
		slider.setValue("17");
		Assert.assertEquals(slider.getValue(), "17");
		slider.setValue("0");
		Assert.assertEquals(slider.getValue(), "0");
		slider.setValue("100");
		Assert.assertEquals(slider.getValue(), "100");
	}
	@BeforeMethod
	public void setup() {
		super.setup();
	}

	@AfterMethod
	public void cleanup() {
		super.cleanup();
	}

}
