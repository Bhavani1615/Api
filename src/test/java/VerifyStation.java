import static io.restassured.RestAssured.given;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.response.Response;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.path.json.JsonPath;

public class VerifyStation {
@Test
public void verify(){
	        Response response =given().
			baseUri("http://api.openweathermap.org")
		    .queryParam("appid","90cfacb8a745a15a411275d109bcf880")
			.when().get("/data/3.0/stations")
			.then().extract().response();
	        JsonPath jsonpath=response.jsonPath();
	        System.out.println(jsonpath.get("name"));
	        String responseBody=response.getBody().asString();
	       // JsonPath jsonpath=response.jsonPath();
	        Assert.assertEquals(responseBody.contains("DEMO_TEST001"),true);
	        Assert.assertEquals(responseBody.contains("Bhavani"),true);
	        Assert.assertEquals(responseBody.contains("-111.43"),true);
	        Assert.assertEquals(responseBody.contains("444"),true);
	        
	        
			
	
	
}
}
