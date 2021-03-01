import org.junit.Test;

import io.restassured.response.Response;

//import static io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;


public class GetStatic {
	@Test
public void GetStaticTest(){
		Response response= given().
				baseUri("https://reqres.in")
				.when().get("/api/users/2")
				.then()
				.extract().response();

		response.prettyPrint();
		
	
}
}
