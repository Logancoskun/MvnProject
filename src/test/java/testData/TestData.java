package testData;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class TestData {
      /*
                {
  "userId": 3,
  "id": 22,
  "title": "dolor sint quo a velit explicabo quia nam",
  "body": "eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"

                 */

    public int successStatusCode = 200;
    public int successCreatedCode = 201;
    public int getSuccessStatusCode1 = 201;

    public JSONObject expectedData() {
        JSONObject body = new JSONObject();
        body.put("userId", 3);
        body.put("id", 22);
        body.put("title", "dolor sint quo a velit explicabo quia nam");
        body.put("body", "eos qui et ipsum ipsam suscipit aut\n" +
                "sed omnis non odio\n" +
                "expedita earum mollitia molestiae aut atque rem suscipit\n" +
                "nam impedit esse");

        return body;

    }

    public JSONObject newCreation() {

        JSONObject body1 = new JSONObject();
        body1.put("userId", 111);
        body1.put("id", 101);
        body1.put("title", "dollarama");
        body1.put("body", "sevgi");

        return body1;

    }

    public JSONObject newCreation1() {

        JSONObject body2 = new JSONObject();
        body2.put("userId", 170);
        body2.put("id", 101);
        body2.put("title", "Ayse");
        body2.put("body", "Coskun");

        return body2;

    }

    public JSONObject newCreation2() {

        JSONObject body3 = new JSONObject();
        body3.put("userId", 170);
        body3.put("id", 101);
        body3.put("title", "Ayse");
        body3.put("body", "Coskun");

        return body3;

    }

    public Map newMapCreation() {

        Map<String, Object> body4 = new HashMap<>();
        body4.put("title", "Ahmet");
        body4.put("body", "Merhaba");
        body4.put("userId", 11.0);
        body4.put("Id", 111.0);

        return body4;

    }

    public JSONObject getRequest() {
        JSONObject b = new JSONObject();
        b.put("userId", 5);
        b.put("id", 44);
        b.put("title", "optio dolor molestias sit");
        b.put("body", "temporibus est consectetur dolore\n" +
                "net libero debitis vel velit laboriosam quia\n" +
                "nipsum quibusdam qui itaque fuga rem aut\n" +
                "nea et iure quam sed maxime ut distinctio quae");

        return b;

    }

    public JSONObject newnewcreation() {

        JSONObject last = new JSONObject();
        last.put("title", "APIOR");
        last.put("body", "API ogrenmek guzellik");
        last.put("userId", 11);

        return last;

    }

    public JSONObject lastcreation() {
        /*{
            "userId": 5,
                "id": 44,
                "title": "optio dolor molestias sit",
                "body": "temporibus est consectetur dolore\net libero debitis vel velit laboriosam quia\nipsum quibusdam qui itaque fuga rem aut\nea et iure quam sed maxime ut distinctio quae"
        }

         */
        JSONObject Js = new JSONObject();

        Js.put("id", 44);
        Js.put("userId", 5);
        Js.put("title", "optio dolor molestias sit");
        Js.put("body", "temporibus est consectetur dolore\n" +
                "et libero debitis vel velit laboriosam quia\n" +
                "ipsum quibusdam qui itaque fuga rem aut\n" +
                "ea et iure quam sed maxime ut distinctio quae");
        return Js;
    }

      public JSONObject getRequestcreation(){

        JSONObject json = new JSONObject();
        json.put("userId", 5);
        json.put("title", "optio dolor molestias sit");
        json.put("id", 44);
        json.put("body", "temporibus est consectetur dolore\n" +
                "et libero debitis vel velit laboriosam quia\n" +
                "ipsum quibusdam qui itaque fuga rem aut\n" +
                "ea et iure quam sed maxime ut distinctio quae");

        return json;
      }
      public JSONObject lastlastcreation(){

        JSONObject body11 = new JSONObject();
          body11.put("title", "API");
          body11.put("body", "API ogrenmek is very nice");
          body11.put("userId", 10);

          return body11;
      }
      public Map deserialization(){

        Map <String, Object> map1= new HashMap<>();

          map1.put("title","Ahmet");
          map1.put("body", "Merhaba");
          map1.put("userId", 11.0);
          map1.put("Id", 111.0);

          return map1;
      }

      public Map newnewnewcreationMap(){

        Map<String, Object> mappp= new HashMap<>();
          mappp.put("title","Ahmet");
          mappp.put("body", "Merhaba");
          mappp.put("userId", 11.0);
          mappp.put("Id", 111.0);

          return mappp;
      }
}

