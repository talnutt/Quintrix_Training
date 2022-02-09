import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager {
public WebDriver driver;
	
	public void edgeDriver () {
	String edgeDriverPath = "/Users/tealek.alnutt/Downloads/edgedriver_mac64/msedgedriver";
	System.setProperty("webdriver.edge.driver", edgeDriverPath);

	this.driver = new EdgeDriver();	
	}

}
