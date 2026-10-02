package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;
import java.util.HashMap;

public class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {

        given().
                header("Content-Type", "application/json").
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").
                then().
                statusCode(200).
                body("userId", equalTo(1)).
                body("id", equalTo(1)).

                body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                log().all();
    }

        @Test
        void shouldUpdatePost () {
            Map<String, Object> updatedPost = new HashMap<>();
            updatedPost.put("id", 1);
            updatedPost.put("title", "Updated title");

            given().
                    header("Content-Type", "application/json").
                    body(updatedPost).
                    when().
                    put("https://jsonplaceholder.typicode.com/posts/1").
                    then().
                    statusCode(200).
                    body("title", equalTo("Updated title"));
        }
    }