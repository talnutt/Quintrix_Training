package RadioButton;

import org.testng.annotations.Test;

import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RadioButtonTests extends TestBase {
	
	public RadioButtons page;

	@Test
	public void canSelectYes() {
		String expectedResultText = "Yes";

		String resultLabelText = ((RadioButtons) new RadioButtons(this.getDriver()).navigate()).selectRadioButton("Yes")
				.getResultText();

		Assert.assertEquals(resultLabelText, expectedResultText, "the radio button was not selected");
	}
	
	
	@Test
	public void canSelectImpressiveButton() {
		String expectedResultText = "Impressive";

		String resultLabelText = new RadioButtonPage(this.getDriver()).navigate().selectRadioButton("Impressive")
				.getResultText();

		Assert.assertEquals(resultLabelText, expectedResultText, "the radio button was not selected");
	}
	@Test
	public void canSelectNoButton() {
		String expectedResultText = "Impressive";

		String resultLabelText = new RadioButtonPage(this.getDriver()).navigate().selectRadioButton("Impressive")
				.getResultText();

		Assert.assertEquals(resultLabelText, expectedResultText, "the radio button was not selected");
	}
		
	
	@BeforeMethod
	public void setup() {
		launchChromeDriver();
	}
	
	@AfterMethod
	public void cleanup() {
		this.getDriver().quit();
	}
	
}