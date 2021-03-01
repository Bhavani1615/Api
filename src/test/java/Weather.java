import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.response.Response;

public class Weather {
	@Test
public void openweather(){
		Response response= given().
				baseUri("http://api.openweathermap.org")
				.when().post("/data/3.0/stations")
				.then()
				.extract().response();

		response.prettyPrint();
		
	
}

}
