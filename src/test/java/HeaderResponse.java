import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class HeaderResponse {
//	@Test
//	public void originalheaader()
//	{
//	        given().
//	        baseUri("https://dummyapi.io")
//	            .header("app-id", "600abcdb5ecdcd270b30dcb3")
//	            .when()
//	            .get("/data/api/user/0F8JIqi4zwvb77FGz6Wt")
//	            .then().log().status();
//	    }
//	@Test
//	public void manipulatedheader ()
//	{
//	        given().
//	        baseUri("https://dummyapi.io")
//	            .header("app-id", "600abcdb5ecdcd270b30dcb")
//	            .when()
//	            .get("/data/api/user/0F8JIqi4zwvb77FGz6Wt")
//	            .then().log().status();
//	    }
	
	
	
	@Test
	public void Response()
	{
		given()
		 .baseUri("https://restcountries.eu")
		  .log().all()
		 //.header("Host","<calculated when request is sent>")
			.when()
			.get("/rest/v2/name/aruba?fullText=true")
			.then()
			.log().all();
	}
//	@Test
//	public void Response3()
//	{
//		given()
//		 .baseUri("https://restcountries.eu")
//		 .header("Host","<calculated when request is sent>")
//		 .log().all()
//			.when()
//			.get("/rest/v2/name/aruba?fullText=true")
//			.then()
//			.log().all();
//	}
	
}


