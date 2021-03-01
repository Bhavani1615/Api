import static io.restassured.RestAssured.given;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.response.Response;

public class Delete {
	@Test
	public void DeleteStations()
	{
//		Response response=given()
//		.baseUri("http://api.openweathermap.org")
//		.queryParam("appid","90cfacb8a745a15a411275d109bcf880")
//		
		       given().
				baseUri("http://api.openweathermap.org")
			    .queryParam("appid","90cfacb8a745a15a411275d109bcf880")
				.when().delete("/data/3.0/stations/603bd6b009e7430001b9df30")
				.then().log().ifStatusCodeIsEqualTo(204);
		       
	}
	@Test
	public void DeleteStation()
	{

		        given().
				baseUri("http://api.openweathermap.org")
			    .queryParam("appid","90cfacb8a745a15a411275d109bcf880")
				.when().delete("/data/3.0/stations/603bd6b009e7430001b9df31")
				.then().log().status();
	}

}
