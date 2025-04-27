package NonBDDStyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBddStyleRequest {
	@Test
	public void getMethod()
	{   RestAssured.baseURI="https://reqres.in";
		RequestSpecification resSpec= RestAssured.given();
		
		Response response=resSpec.request(Method.GET,"/api/users/2");
		System.out.println(response.asPrettyString());
		
	}


}
