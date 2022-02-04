import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsSeries {
	private WebDriver driver;
	public ProductsSeries(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnProduct() {
		driver.findElement(By.cssSelector("img[alt='Classic Series: Bass heads & enclosures']")).click();

	}
}
