package RequestExamples;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.junit.Test;

public class FilePayloadExample {
	
	@Test
	public void postMethod()
	{  
		
		given()
		  .baseUri("https://reqres.in")
		  .header("x-api-key","reqres-free-v1")
		  .contentType("application/json")
		  .body(new File("src/test/resources/test.json"))
		.when()
		  .post("/api/users").prettyPrint();
	}

}
