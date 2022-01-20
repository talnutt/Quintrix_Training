package HyperlinkTest;
import org.testng.annotations.Test;

import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HyperLinkTest extends TestBase{

	@Test 

	public void canGetHyperLink() {
		final String url = "https://demoqa.com/links";
		getDriver().navigate().to(url);
		HyperLinkPage hyperlink = new HyperLinkPage();
		hyperlink.click("created");
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
