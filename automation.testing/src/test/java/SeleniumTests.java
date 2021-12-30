import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTests {
  @Test
  public void canLaunchWebDriver() {
	  String driverPath = "/usr/bin/safaridriver";
	  System.setProperty("webdriver.safari.driver", driverPath);
	  
	  String url = "https:www.selenium.dev/";
	  WebDriver driver = new SafariDriver();
	  
	  driver.navigate().to(url);
	  String currentURL = driver.getCurrentUrl();
	  Assert.assertEquals(url, currentURL);
  }
}
