import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
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
	
	@Test
	public void canReadBasses() throws Exception {
		ConfigurationProvider csvReader = new ConfigurationProvider();
		
		HashMap<String, String> basses = csvReader.getPropertiesFromResourceFile("basses.csv");
		
		System.out.println(basses.keySet());
		assertNotNull(basses.keySet());

}
