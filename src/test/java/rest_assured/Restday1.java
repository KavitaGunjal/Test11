package rest_assured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Restday1 {

	
	@Test
	
	void fethUser() {
	//given()
	
	when()
	.get("https://reqres.in/api/users?page=2")
		
	.then()
	.statusCode(200)
	.log().all();
}
}
