import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class APITests {
	WebDriver driver;

	@Test
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
	}
	@Test
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
	}
	@Test
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
	}
	@Test
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
	}
	@Test
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
		String actualName = response.jsonPath().getString("name");
		String updatedTimeStamp = response.getHeader("Date");
	}
	
	@Test
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
		Users[] users = response.getBody().jsonPath().getObject("user data", Users[].class);
		
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

}
