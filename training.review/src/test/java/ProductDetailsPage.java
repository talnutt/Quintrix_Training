import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
private WebDriver driver;
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
public ProductPage clickOnProductType() {
	driver.findElement(By.cssSelector("a[href='svt810e']"))	.click();
	return ProductPage;
}
}
