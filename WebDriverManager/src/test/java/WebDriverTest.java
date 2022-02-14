import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class WebDriverTest extends TestBase{
  @Test
  public void canLaunchBrowser() {
	  String expectedURL = "http://automationpractice.com/index.php";
		
		this.getDriver().navigate().to(expectedURL);
		String actualURL = this.getDriver().getCurrentUrl();

		Assert.assertEquals(actualURL, expectedURL);
  }
  @BeforeMethod
  public void beforeMethod() {
		super.setup();
	}

  @AfterMethod
  public void afterMethod() {
		super.cleanup();
	}

}
