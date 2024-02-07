package rest_assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Pathparam {
	
	
	//https://reqres.in/api/users?page=2
	@Test
	void QueryPathParameter() {
		
		given()
		.pathParam("path_parameter_1","api1" )
		.pathParam("path_parameter_2", "users")
		.queryParam("page", 4)
		
		
		.when()
		.get("https://reqres.in/{path_parameter_1}/{path_parameter_2}")
		
		.then()
        .log().all();
		
		
		
	}

}
