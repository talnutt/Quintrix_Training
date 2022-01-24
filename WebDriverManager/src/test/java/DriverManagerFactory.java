import java.sql.DriverManager;

public class DriverManagerFactory extends TestBase{

	public static DriverManager getManager(String browserType) {

		if(browserType.equals("chrome")) {
			return new ChromeDriverManager();
		}else if(browserType.equals("edge")) {
			return new EdgeDriverManager();
		}
		return null;
	}
}