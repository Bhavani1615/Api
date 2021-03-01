import static io.restassured.RestAssured.given;



import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class StationRegister {
	@Test
	public void Register()
	{
	 JSONObject json=new JSONObject();
	    json.put("external_id","DEMO_TEST001");
	    json.put("name","Bhavani");
	    json.put("longitude",-111.43);
	    json.put("altitude",444);
//		String response=given().
//				baseUri("http://api.openweathermap.org")
//				.param("appid","90cfacb8a745a15a411275d109bcf880")
////	
//		HashMap<String,String> map= new HashMap<String,String>();
//		map.put("external_id","DEMO_TEST001");
//	    map.put("name","Bhavani");
//	    map.put("longitude","-111.43");
//		map.put("altitude","444");
		
	
			RestAssured.baseURI="http://api.openweathermap.org";
			given()
			.baseUri("http://api.openweathermap.org")
			.header("Content-Type","application/json")
			.queryParam("appid","90cfacb8a745a15a411275d109bcf880")
			.body(json.toJSONString())
			.when().post("/data/3.0/stations")
			.then().log().status();
			
	}
	@Test
	public void Register1()
	{
	 JSONObject json=new JSONObject();
	    json.put("external_id","Interview1");
	    json.put("name","Interview Station <Random Number");
	    json.put("longitude",-12.44);
	    json.put("altitude",444);
//		String response=given().
//				baseUri("http://api.openweathermap.org")
//				.param("appid","90cfacb8a745a15a411275d109bcf880")
////	
//		HashMap<String,String> map= new HashMap<String,String>();
//		map.put("external_id","DEMO_TEST001");
//	    map.put("name","Bhavani");
//	    map.put("longitude","-111.43");
//		map.put("altitude","444");
		
	
			RestAssured.baseURI="http://api.openweathermap.org";
			given()
			.baseUri("http://api.openweathermap.org")
			.header("Content-Type","application/json")
			.queryParam("appid","90cfacb8a745a15a411275d109bcf880")
			.body(json.toJSONString())
			.when().post("/data/3.0/stations")
			.then().log().status();
	
			
		
	}
}

