package SchemevalidationExamples;
import static io.restassured.RestAssured.given;

import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredSchemaValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		given()
		  .header("x-api-key","reqres-free-v1")
		   .baseUri("https://reqres.in")
		.when()
		   .get("/api/users")
		.then()
		    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json")).log().all();
		
		/* We can pass schema as a File, InputStream, String, Reader in method JsonSchemaValidator.matchesJsonSchema()*/
	}

}
