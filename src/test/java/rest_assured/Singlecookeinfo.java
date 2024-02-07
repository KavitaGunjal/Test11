package rest_assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

//import com.github.scribejava.core.model.Response;


public class Singlecookeinfo {

	
	@Test
	void Cookiessingle() {
		
		Response cookie_var = given()
		
		.when()
		.get("https://www.google.com/");
		
		String cok_var = cookie_var.getCookie("logged_in");
		System.out.println(cok_var);
		
		
		
		
		
	}
}
