package Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API_getRequest {

    /*

        https://jsonplaceholder.typicode.com/posts/44

        -Get URL
        -The response status code is 200,
        -The content type is JSON,
        -In Response body verify the userId is 5,
        -In Response body verify the title is: "optio dolor molestias sit"

     */

    @Test
    public void get01() {
        //First basic two pre-conditions

        //1- Request URL and Body
        String url = "https://jsonplaceholder.typicode.com/posts/100";

        Response response= given().when().get(url);

        // -The response status code is 200,
        response.then().assertThat().statusCode(200);
        response.prettyPrint();

        // -The content type is JSON,
        response.then().assertThat().contentType(ContentType.JSON);
        response.prettyPrint();

        //-In Response body verify the userId is 10,
        //-In Response body verify the title is: "at nam consequatur ea labore ea harum"
        JSONObject expected= new JSONObject();
        expected.put("userId", 10);
        expected.put("title","at nam consequatur ea labore ea harum" );

        JsonPath actual = response.jsonPath();

        Assert.assertEquals(expected.get("userId"), actual.get("userId"));
        Assert.assertEquals(expected.get("title"), actual.get("title"));





    }

}