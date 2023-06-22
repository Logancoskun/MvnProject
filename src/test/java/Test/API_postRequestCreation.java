package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import testData.TestData;

import static io.restassured.RestAssured.given;

public class API_postRequestCreation extends JsonPlaceHolderBaseUrl {

    @Test
    public void test01(){

        TestData postObject = new TestData();

        Response response = given().spec(jSonPlaceHolderspec).contentType(ContentType.JSON).when().body(postObject.newCreation().toString()).post();
        response.prettyPrint();
        //create expected data
        TestData testD = new TestData();

        JSONObject expected = testD.newCreation();
        JsonPath actual = response.jsonPath();

        Assert.assertEquals(postObject.successCreatedCode, response.getStatusCode());
        Assert.assertEquals(expected.getInt("userId"), actual.getInt("userId"));
        Assert.assertEquals(expected.getInt("id"), actual.getInt("id"));
        Assert.assertEquals(expected.getString("title"), actual.getString("title"));
        Assert.assertEquals(expected.getString("body"), actual.getString("body"));
    }


}
