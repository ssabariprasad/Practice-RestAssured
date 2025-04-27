package POJOtoJSON;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class POJOSerialize {
	
@Test
public void pojoTest()
{    User user=new User();
     user.setName("Kishore");
     user.setJob("Support Lead");
	  given()
	  .baseUri("https://reqres.in")
	  .header("x-api-key","reqres-free-v1")
	  .contentType("application/json")
	  .body(user).log().all()
	.when()
	  .post("/api/users").prettyPrint();
}

}
