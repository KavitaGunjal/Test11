package rest_assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;



public class APIPREAPAREDBOWN {
	int id;
	@Test(priority=1)
	void CREATEdATA() {

	JSONObject name = new JSONObject();
	name.put("first_name", "Kavita");
	name.put("last_name", "Gunjal");
	//name.put("", "Kavita");
	name.put("roll_number", "11");
	name.put("Add", "Pune");
    name.put("School_name", "Test");
	
	given()
	
	.contentType("application/json")
	.body(name.toString())
	
	.when()
	.post("http://localhost:3000/Students")
	.jsonPath().getInt("id");

}

	@Test(priority=2)
	void updatedATA() {

	JSONObject name = new JSONObject();
	name.put("first_name", "Savita");
	name.put("last_name", "Gujar");
	//name.put("", "Kavita");
	//name.put("roll_number", "11");
	//name.put("Add", "Pune");
    //name.put("School_name", "Test");
	
	given()
	
	.contentType("application/json")
	.body(name.toString())
	
	.when()
	.post("http://localhost:3000/Students"+ id);
	
	}}
	//.jsonPath().getInt("id");