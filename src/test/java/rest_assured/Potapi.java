package rest_assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import org.json.JSONObject;
//import org.json.JSONObject;


public class Potapi {
	
	@Test
	void createData() {
		
		JSONObject name = new JSONObject();
		name.put("name", "Kavita");
		name.put("job", "Testing");
		
		given()
		
		.contentType("application/json")
		.body(name.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();
		
		
		
		
		
		
	}

}
