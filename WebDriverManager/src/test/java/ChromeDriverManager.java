import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {
	WebDriver driver;
	public void chromeDriver () {
		String chromeDriverPath = "/Users/tealek.alnutt/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		this.driver = new ChromeDriver();	
		}

}
