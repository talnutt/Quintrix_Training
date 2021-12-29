import java.io.FileReader;
import java.util.Properties;

import org.junit.Test;

public class BrowserTest {
	
	@Test
	public void canGetBrowserType() {
		
		try (FileReader reader = new FileReader("config")) {
			Properties properties = new Properties ();
			properties.load(reader);
			
			
			String BrowserType = properties.getProperty("BrowserType");
			
			System.out.println(BrowserType);
		}
		
		catch (Exception e) {
			;
			e.printStackTrace();
		}
	}
	
	

}
