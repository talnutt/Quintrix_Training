import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class WebDriverTests {
	private WebDriver driver;

	@Test
	public void canLaunchWebDriver() {
		System.setProperty("webdriver.chrome.driver","/Users/tealek.alnutt/Downloads/chromedriver");
		this.driver = new ChromeDriver();
		Assert.assertNotNull(this.driver, "Chrome driver was null");
	}
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void cleanup() {
		this.driver.quit();
	}

}
