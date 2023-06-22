package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import testData.TestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Api_Deserialization_PutRequest extends JsonPlaceHolderBaseUrl {

    @Test
    public void test01(){

        jSonPlaceHolderspec.pathParams("sungur", 70);

        TestData mapBody = new TestData();

        Map<String, Object> actual = mapBody.newMapCreation();


       Response response = given().spec(jSonPlaceHolderspec).contentType(ContentType.JSON).body(actual).put("{sungur}");

      // response.prettyPrint();

       Map<String, Object> expected = new HashMap<>();

        expected.put("title","Ahmet");
        expected.put("body", "Merhaba");
        expected.put("userId", 11.0);
        expected.put("Id", 111.0);

        Map<String, Object> responseMapBody = response.as(HashMap.class);

        Assert.assertEquals(expected.get("title"), responseMapBody.get("title"));
        Assert.assertEquals(expected.get("body"), responseMapBody.get("body"));
        Assert.assertEquals(expected.get("userId"), responseMapBody.get("userId"));
        Assert.assertEquals(expected.get("Id"), responseMapBody.get("Id"));



    }


}
