package SerializationExample;

import static io.restassured.RestAssured.given;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class MapSerialization {
	
	@Test
	public void postMethod()
	{  
		Map<String, Object> payLoad= new LinkedHashMap<String,Object>();
		payLoad.put("Name","vinoth");
		payLoad.put("Job","DEV Lead");
		
		
		given()
		  .baseUri("https://reqres.in")
		  .header("x-api-key","reqres-free-v1")
		  .contentType("application/json")
		  .body(payLoad)
		.when()
		  .post("/api/users").prettyPrint();
	}

}
