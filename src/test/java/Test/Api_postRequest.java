package Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Api_postRequest {
    /*

        https://jsonplaceholder.typicode.com/posts

       1-Send the following POST request to the URL:

        {
         "title": "API",
         "body": "API ogrenmek guzel",
         "userId": 10
        }

        2-Verify that the response status code is 201,
        3-Verify that the content type is application/json
        4-Verify that the new posted body is accurate. (Do not verify the ID)

        {
         "title": "API",
         "body": "API ogrenmek guzel",
         "userId": 10
        }

         */
    @Test
    public void apiPost01(){

        //1-Send the following POST request to the URL:
        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject postBody = new JSONObject();
        postBody.put("title", "API");
        postBody.put("body", "API ogrenmek guzel");
        postBody.put("userId", 10);

        Response response= given().contentType(ContentType.JSON).when().body(postBody.toString()).post(url);

        //  2-Verify that the response status code is 201, 3-Verify that the content type is application/json
        response.then().assertThat().statusCode(201).contentType(ContentType.JSON);
        response.prettyPrint();

        // 4-Verify that the new posted body is accurate. (Do not verify the ID)
        JSONObject expectedResult = new JSONObject();
        expectedResult.put("title", "API");
        expectedResult.put("body", "API ogrenmek guzel");
        expectedResult.put("userId", 10);

        JsonPath actualResult = response.jsonPath();

        Assert.assertEquals(expectedResult.get("title"), actualResult.get("title"));
        Assert.assertEquals(expectedResult.get("body"), actualResult.get("body"));
        Assert.assertEquals(expectedResult.get("userId"), actualResult.get("userId"));

    }


}
