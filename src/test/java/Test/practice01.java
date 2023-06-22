package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import testData.TestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class practice01 extends JsonPlaceHolderBaseUrl{

    @Test
    public void test01() {

     jSonPlaceHolderspec.pathParams("pp1", 99);

     TestData t= new TestData();

     //Map<String, Object> body1 = t.newnewnewcreationMap();

     Response response = given().spec(jSonPlaceHolderspec).contentType(ContentType.JSON).when().body(t.newnewnewcreationMap()).put("{pp1}");

        Map<String, Object> actual= new HashMap<>();
        actual.put("title","Ahmet");
        actual.put("body", "Merhaba");
        actual.put("userId", 11.0);
        actual.put("Id", 111.0);

        Map<String, Object> expected = response.as(HashMap.class);

        Assert.assertEquals(actual.get("title"), expected.get("title"));
        Assert.assertEquals(actual.get("body"), expected.get("body"));
        Assert.assertEquals(actual.get("userId"), expected.get("userId"));
        Assert.assertEquals(actual.get("Id"), expected.get("Id"));

        response.prettyPrint();

    }
}
