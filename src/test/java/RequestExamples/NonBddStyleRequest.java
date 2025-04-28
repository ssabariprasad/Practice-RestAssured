package RequestExamples;



import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBddStyleRequest {
	@Test
	public void getMethod()
	{   RestAssured.baseURI="https://reqres.in";
		RequestSpecification resSpec= RestAssured.given().header("x-api-key","reqres-free-v1");
		
		Response response=resSpec.request(Method.GET,"/api/users");
		System.out.println(response.asPrettyString());
		
	}

	@Test
	public void postMethod()
	{   RestAssured.baseURI="https://reqres.in";
		RequestSpecification resSpec= RestAssured.given().header("x-api-key","reqres-free-v1").contentType("application/json").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
		
		Response response=resSpec.request(Method.POST,"/api/users");
		System.out.println(response.asPrettyString());
		
	}
	
	@Test
	public void putMethod()
	{   RestAssured.baseURI="https://reqres.in";
		RequestSpecification resSpec= RestAssured.given().header("x-api-key","reqres-free-v1").contentType("application/json").body("{\r\n"
				+ "    \"name\": \"Kingsly\",\r\n"
				+ "    \"job\": \"Anand\"\r\n"
				+ "}");
		
		Response response=resSpec.request(Method.PUT,"/api/users/2");
		System.out.println(response.asPrettyString());
		
	}
	
	@Test
	public void deleteMethod()
	{   RestAssured.baseURI="https://reqres.in";
		RequestSpecification resSpec= RestAssured.given().header("x-api-key","reqres-free-v1");
		
		Response response=resSpec.request(Method.DELETE,"/api/users/2");
		System.out.println(response.asPrettyString());
		
	}
}
