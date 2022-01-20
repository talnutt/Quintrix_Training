package RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
	
	protected WebDriver driver;
	private final String url = "https://demoqa.com/radio-button";
	
	public RadioButtonPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to(url);
	}
	public WebElement findElement(String id) {
		return this.driver.findElement(By.id(id));
	}
	public void select(String label) {
		// TODO Auto-generated method stub
		
	}
	public RadioButtonPage navigate() {
		this.driver.navigate().to(url);
		return this;
	}
	public RadioButtons selectRadioButton(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
