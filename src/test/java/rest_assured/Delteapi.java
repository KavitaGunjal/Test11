package rest_assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Delteapi {
	
	@Test
	
	void deleteAPI() {
		
		when()
		.delete("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(204)
		.log().all();
		
		
	}
	

}
