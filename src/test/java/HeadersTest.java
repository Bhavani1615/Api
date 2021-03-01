
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeadersTest {
	@Test
	 public void GetTest()
	 {   
	 
	 RestAssured.baseURI = "https://restcountries.eu";  //BaseUrl
	 RequestSpecification httpRequest = RestAssured.given();//sending request for the server
	 Response response = httpRequest.request(Method.GET, "/rest/v2/name/aruba?fullText=true");//getting the response from the server
	 Headers allheaders=response.headers();
	 for(Header header:allheaders)
	 {
		 System.out.println(header.getName()+"  "+header.getValue());
	 }
	 
}
}
