import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage extends PageObject {
	private WebDriver driver;

	public ProductPage(WebDriver driver) {
		super(driver);

	}
	public String findArtist() {
		return getDriver().findElement(By.cssSelector("div#artist p b")).getText();
	}
}
