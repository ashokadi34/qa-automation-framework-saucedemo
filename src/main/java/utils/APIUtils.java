package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIUtils {

    public static String createUser() {

        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in/api")
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"Ashok\", \"job\": \"QA\" }")
                .post("/users");

        return response.jsonPath().getString("id");
    }
}