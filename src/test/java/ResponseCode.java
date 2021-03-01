import org.testng.annotations.Test;


import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ResponseCode {
@Test
public void ErrorCode(){
	
          given()
		 .baseUri("https://restcountries.eu")
			.when()
			.get("/rest/v2/name/aruba?fullText=true")
			.then()
			.log().status();
          

}
@Test
public void Response2(){// not found Url
	given()
	 .baseUri("https://restcountries.eu")
		.when()
		.get("/rt/v2/name/aruba?fullText=true")
		.then()
		.log().status();
	
}
@Test
public void Response3()
{
	given()
	 .baseUri("https://restcountries.eu")
	 .header("Host","<calculated when request is sent>")
		.when()
		.get("/rest/v2/name/aruba?fullText=true")
		.then()
		.log().status();
}
@Test
public void Response4(){
	given()
	 .baseUri("http://restcountries.eu")
		.when()
		.post("/rest/v2/region/Europe")
		.then()
		.log().status();

}
@Test
public void StatusCode403(){
    given().
    baseUri("https://dummyapi.io")
        .header("app-id", "600abcdb5ecdcd270b30dcb")
        .when()
        .get("/data/api/user/0F8JIqi4zwvb77FGz6Wt")
        .then().log().status();
}
}
