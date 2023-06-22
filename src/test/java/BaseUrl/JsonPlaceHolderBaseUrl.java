package BaseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification jSonPlaceHolderspec;

    @Before
    public void setUp(){

        jSonPlaceHolderspec= new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/posts").build();

    }

}
