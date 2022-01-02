import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class BrowserTest {
	
	
	@Test
	public void canGetBrowserType() throws IOException {
		Properties prop = new Properties();
		InputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.resources");
			prop.load(inputStream);
		} 
		finally {
			inputStream.close();
		}
		
		System.out.println(prop.getProperty("BrowserType"));
	}
	
}
