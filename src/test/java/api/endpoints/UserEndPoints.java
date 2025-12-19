package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payloads.User;
import io.restassured.http.ContentType;

public class UserEndPoints {
	
	
	
	public static Response createUser(User payload) {
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routs.post_uri);
		return response;
		
		
	}

}
