import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	private WebDriver driver;

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
		Path resourceDirectory = Paths.get("target");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		Path driverFile = Paths.get(absolutePath, "chromedriver");

		this.driver = new ChromeDriver();	
		
		long pageLoadTimeout = 60;
		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout , TimeUnit.SECONDS);
	}
}
