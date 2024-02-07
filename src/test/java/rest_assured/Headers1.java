package rest_assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Headers1 {
	
	@Test
	
	void headerTest() {
		
		when()
		.get("https://github.com/")
		
		.then()
		.header("Server", "GitHub.com");
		
		
	}

}
