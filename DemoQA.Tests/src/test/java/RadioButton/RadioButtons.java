package RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automationpractice.pages.PageObjectBase;
import framework.TestBase;

public class RadioButtons extends PageObjectBase{
	protected RadioButtons(WebDriver driver) {
		super(driver);
	}
	public final String url = "https://demoqa.com/radio-button";
	WebDriver driver = new ChromeDriver();

	@FindBy(how = How.CSS, using = "input[name='like']")
	private List<WebElement> radioButtonElements;

	@FindBy(how = How.CLASS_NAME, using = "text-success")
	private List<WebElement> resultText;


	public RadioButtons selectRadioButton (String label) {
		new RadioButtonPage(driver).select(label);
		return this;
	}
	public WebDriver navigate() {
		this.driver.navigate().to(url);
		return this.driver;
	}

	public String getResultText() {
		return resultText.size() > 0 ? resultText.get(0).getText() : null;
	}
}