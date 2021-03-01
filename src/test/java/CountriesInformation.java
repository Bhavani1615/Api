import static io.restassured.RestAssured.given;


import org.junit.Test;

import io.restassured.response.Response;

public class CountriesInformation {
	
	@Test
	public void fullname(){
			Response response= given().
					baseUri("https://restcountries.eu")
					.queryParam("fullText","true")
					.when()
					.get("/rest/v2/name/aruba")
					.then()
					.extract().response();

			response.prettyPrint();
			

	}
	@Test
	public void listofcodes(){
			Response response= given().
					baseUri("https://restcountries.eu")
					.when()
					.get("/rest/v2/alpha?codes=col;no;ee")
					.then()
					.extract().response();

			response.prettyPrint();
	
}
	@Test
	public void currency(){
			Response response= given().
					baseUri("https://restcountries.eu")
					.when()
					.get("/rest/v2/currency/cop")
					.then()
					.extract().response();

			response.prettyPrint();
	
}
}

