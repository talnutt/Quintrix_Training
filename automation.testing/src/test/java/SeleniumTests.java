import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTests {
  @Test
  public void canLaunchWebDriver() {
	  String chromeDriverPath = "/Users/tealek.alnutt/Downloads/chromedriver";
	  String edgeDriverPath = "/Users/tealek.alnutt/Downloads/edgedriver_mac64/msedgedriver";
	  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	  System.setProperty("webdriver.edge.driver", edgeDriverPath);
	  
	  String url = "https://www.selenium.dev/";
	  WebDriver driver = new EdgeDriver();
	  
	  driver.navigate().to(url);
	  String currentURL = driver.getCurrentUrl();
	  Assert.assertEquals(url, currentURL);
  }
  
  @Test
  public void canClickButton() {
	  
  }
}
