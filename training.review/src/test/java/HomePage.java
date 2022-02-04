import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void navigate() {
		driver.navigate().to("https://ampeg.com");

	}
	public ProductsSeries goProducts() {
		driver.findElement(By.cssSelector("a[title='Products']")).click();
		return ProductSeries();
	}
}
