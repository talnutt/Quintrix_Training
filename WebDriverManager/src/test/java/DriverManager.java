import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	
	public WebDriver driver;

	public abstract void createWebDriver();

	public WebDriver getDriver() {
		return this.driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void quitDriver() {
		this.driver.quit();
	}
}
