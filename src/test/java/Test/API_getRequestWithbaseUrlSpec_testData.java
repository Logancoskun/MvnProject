package Test;


import BaseUrl.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import testData.TestData;

import static io.restassured.RestAssured.given;

public class API_getRequestWithbaseUrlSpec_testData extends JsonPlaceHolderBaseUrl {

     @Test
    public void test01(){

    jSonPlaceHolderspec.pathParams("pp1", 22);
    // https://jsonplaceholder.typicode.com/posts/22

         Response response = given().spec(jSonPlaceHolderspec).when().get("{pp1}");
         response.prettyPrint();

         TestData testD = new TestData();

         JSONObject expected = testD.expectedData();


         JsonPath actual = response.jsonPath();


         //Assert.assertEquals(testD.successStatusCode, response.statusCode());
         Assert.assertEquals(expected.getInt("userId"), actual.getInt("userId"));
         Assert.assertEquals(expected.getString("title"), actual.getString("title"));
         Assert.assertEquals(expected.getString("body"), actual.getString("body"));




}
}