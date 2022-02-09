import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class APITests {
	WebDriver driver;

	@Parameters({"response"})
	@Test (groups="verify")
	public void canVerifyEmailAddress() {
		String expectedEmail = "janet.weaver@reqres.in";
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath=("/api/users/2");
		Response response = RestAssured.given()		
				.when()
				.get()
				.then()
				.extract()
				.response();
		String actualEmail = response.jsonPath().getString("data.email");
		AssertJUnit.assertEquals(actualEmail, expectedEmail);
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="verify")
	public void canVerifyToken() {
		String expectedToken = "QpwL5tke4Pnpja7X4";
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath=("/api/login");
		Response response = RestAssured.given()		
				.when()
				.get()
				.then()
				.extract()
				.response();
		String actualToken = response.jsonPath().getString("data.token");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="verify")
	public void canDelete() {
		String expectedCode = "204";
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath=("/api/users/2");
		Response response = RestAssured.given()		
				.when()
				.get()
				.then()
				.extract()
				.response();
		String actualCode = response.jsonPath().getString("data.response");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="update")
	public void canPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "morpheus2");
		request.put("job", "zion resident");
		Response response = RestAssured.given()		
				.when()
				.get()
				.then()
				.extract()
				.response();
		String actualName = response.jsonPath().getString("name");
		String updatedTimeStamp = response.getHeader("Date");
		updatedTimeStamp = updatedTimeStamp.substring(0, updatedTimeStamp.length() - 7);
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="update")
	public void canPut() {
		JSONObject request = new JSONObject();
		request.put("name", "morpheus2");
		request.put("job", "zion resident");
		Response response = RestAssured.given()		
				.when()
				.get()
				.then()
				.extract()
				.response();
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups="deserialize")
	public void canGetSingleUser() {
		String expectedEmail = "janet.weaver@reqres.in";
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath=("/api/users/2");
		Response response = RestAssured.given()
				.when()
				.get()
				.then()
				.extract()
				.response();
		Users[] users = response.getBody().jsonPath().getObject("userdata", Users[].class);
		System.out.println(Thread.currentThread().getId());
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","/Users/tealek.alnutt/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod() {
		this.driver.quit();
	}
	@BeforeSuite
	public void dataSetup() {
		System.out.println("Data Setup");
	}
	@AfterSuite
	public void dataTeardown() {
		System.out.println("Data Cleanup");
	}

}
