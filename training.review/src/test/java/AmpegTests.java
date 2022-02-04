import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AmpegTests {
	private WebDriver driver;
	@Test
	public void canVerifyArtist() {
		String expectedArtistName = "Bootsy Collins";
		String artist = new HomePage(driver)
				.navigate()
				.goProducts()
				.clickonProductsTypr()
				.clickOnProduct()
				.findArtist();

		Assert.assertEquals(artist,  expectedArtistName);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","/Users/tealek.alnutt/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		this.driver.quit();
	}

}
