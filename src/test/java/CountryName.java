import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CountryName {
@Test
public void Country()
{
//           given().
//			baseUri("https://restcountries.eu")
//			.when()
//			.get("/rest/v2/capital/tallinn")
//			.then()
//			.extract().
//			jsonPath().get("region");
//           
	RestAssured.baseURI = "https://restcountries.eu";  //BaseUrl
	 RequestSpecification httpRequest = RestAssured.given();//sending request for the server
	 Response response = httpRequest.request(Method.GET, "/rest/v2/all");//getting the response from the server
      JsonPath jsonpath=response.jsonPath();
      //System.out.println(jsonpath.get("nativeName"));
      System.out.println(jsonpath.get("region"));

	
}
}
