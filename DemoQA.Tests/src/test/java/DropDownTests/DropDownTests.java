package DropDownTests;
import org.testng.annotations.Test;

import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DropDownTests extends TestBase{
  @Test
  public void canSetValue() {
	  final String url = "https://demoqa.com/select-menu";
	  String expectedResultText = "Aqua";

		String actualResultText = new DropdownMenu(this.getDriver()).navigate().selectOption(expectedResultText)
				.responseText();

		Assert.assertEquals(actualResultText, expectedResultText);
  }
  
  @Test
  public void canGetOptions () {
	  final String url = "https://demoqa.com/select-menu";
	  
	  String[] expectedResultText = {"Red", "Green", "Yellow", "Magenta", "Aqua"};

		String actualResultText = new DropdownMenu(this.getDriver()).navigate().getOptions(expectedResultText)
				.responseText();
	  
	  
	  
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