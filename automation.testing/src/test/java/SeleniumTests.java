import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTests {
	private EdgeDriver driver;
	private final String url = "https://www.selenium.dev/";
	@Test
	public void canLaunchWebDriver() {

		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(url, currentURL);
	}

	@Test
	public void canClickButton() {
		WebElement element = driver.findElement(By.cssSelector("a[href='/documentation/webdriver/']"));
		element.click();
	}
	@BeforeMethod

	public void setup() {
		String chromeDriverPath = "/Users/tealek.alnutt/Downloads/chromedriver";
		String edgeDriverPath = "/Users/tealek.alnutt/Downloads/edgedriver_mac64/msedgedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		System.setProperty("webdriver.edge.driver", edgeDriverPath);

		this.driver = new EdgeDriver();

		this.driver.navigate().to(url);
	}
	
	@AfterMethod
	
	public void cleanup() {
		this.driver.quit();
	}
}
