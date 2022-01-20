package DropDownTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automationpractice.pages.PageObjectBase;

public class DropdownMenu extends PageObjectBase{
	public WebDriver driver;
	private final String url = "https://demoqa.com/select-menu";
	
	@FindBy(how = How.ID, using = "oldSelectMenu")
	private WebDriver selectElement;

	public DropdownMenu(WebDriver driver) {
		super(driver);
	}

	public DropdownMenu selectOption(String value) {
		new DropDownList(selectElement).setValue(value);
		return this;
	}

	public DropdownMenu navigate() {
		this.driver.navigate().to(url);
		return this;
	}

	public String responseText() {
		DropdownMenu ddm = new DropdownMenu(selectElement);
		return ddm.getValue();
	}

	private String getValue() {
		// TODO Auto-generated method stub
		return getValue();
	}

	public String[] getOptions() {
		DropdownMenu ddm = new DropdownMenu(selectElement);
		return ddm.getOptions();
	}

	public void setValue(String string) {
		// TODO Auto-generated method stub
		
	}
}
