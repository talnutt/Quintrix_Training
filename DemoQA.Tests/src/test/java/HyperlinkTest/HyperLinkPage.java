package HyperlinkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HyperLinkPage {
	private WebDriver driver;

	public void Hyperlink(WebDriver driver) {
		this.driver = driver;
	}

	public void click(String string) {
		driver.findElement(By.id(string)).click();
	}

	
}
