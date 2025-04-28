package RequestExamples;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class BDDStyleRequest {
	
	@Test
	public void getMethod()
	{ 
		given()
		  .header("x-api-key","reqres-free-v1")
		   .baseUri("https://reqres.in")
		.when()
		   .get("/api/users")
		   .prettyPrint();
		
	}

	@Test
	public void postMethod()
	{   given()
		  .baseUri("https://reqres.in")
		  .header("x-api-key","reqres-free-v1")
		  .contentType("application/json")
		  .body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when()
		  .post("/api/users").prettyPrint();
	}
	
	@Test
	public void putMethod()
	{   given()
		  .baseUri("https://reqres.in")
		  .header("x-api-key","reqres-free-v1")
		  .contentType("application/json")
		  .body("{\r\n"
		  		+ "    \"name\": \"Kingsley\",\r\n"
		  		+ "    \"job\": \"QA Lead\"\r\n"
		  		+ "}")
		.when()
		  .put("/api/users/2").prettyPrint();
		
	}
	
	@Test
	public void deleteMethod()
	{   given()
		  .header("x-api-key","reqres-free-v1")
		   .baseUri("https://reqres.in")
		.when()
		   .delete("/api/users/2")
		   .prettyPrint();
		
	}
	

}
