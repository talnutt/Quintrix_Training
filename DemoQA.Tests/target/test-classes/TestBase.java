package framework;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {
	

	private ChromeDriver driver;

	protected WebDriver getDriver() {
		return this.driver;
	}
	
	protected void setup() {
		launchChromeDriver();
	}
	
	protected void cleanup() {
		this.driver.quit();
	}
	
	protected void launchChromeDriver() {
		String chromeDriverPath = "/Users/tealek.alnutt/Downloads/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		this.driver = new ChromeDriver();	
		
		long pageLoadTimeout = 60;
		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout , TimeUnit.SECONDS);
	}
}