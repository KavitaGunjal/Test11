package rest_assured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Cookiestest {
	@Test
	void cookies(){
	given()
	
	.when()
	.get("https://github.com/")
	
	.then()
	//.cookie("AEC","Ae3NU9P1YaOLsB2No_rCz9XAUQRKnuDauH5mkH8b40RE0a-yJjBIH_VNOw; expires=Sat, 03-Aug-2024 10:23:59 GMT; path=/; domain=.google.com; Secure; HttpOnly; SameSite=lax")
	.log().all();

}
}
