package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import Pojos.Booking;
import Pojos.BookingDates;
import Pojos.Bookingid;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APIPost_RequestWithPojo extends JsonPlaceHolderBaseUrl {

    /*

    https://restful-booker.herokuapp.com/booking

    request Body
        `           {
          "bookingid": 11,
             "booking": {
             "firstname": "Ahmet",
             "lastname": "Bulut",
             "totalprice": 15000,
             "depositPaid": true,
             "bookingDates": {
              "checkIn": "2022-09-09",
              "checkOut": "2022-09-21"
            }

          }
        }

        -Status code is 200

 */
    @Test
    public void test01(){

        BookingDates booknested = new BookingDates("2022-09-09", "2022-09-21");
        Booking bookingperson= new Booking("Ahmet", "Bulut", 15000, true);
        Bookingid bookingid = new Bookingid(11, bookingperson, booknested);

        Response response = given().spec(jSonPlaceHolderspec).contentType(ContentType.JSON).when().body(bookingid).post();
        response.prettyPrint();

        Bookingid actual= response.as(Bookingid.class);

        Assert.assertEquals(201, response.getStatusCode());
        System.out.println(response.getStatusCode());

        Assert.assertEquals(bookingid.getBookingid(), actual.getBookingid());
        Assert.assertEquals(bookingperson.getFirstname(),actual.booking.getFirstname());
        Assert.assertEquals(bookingperson.getLastname(),actual.booking.getLastname());
        Assert.assertEquals(bookingperson.getTotalprice(),actual.booking.getTotalprice());
        Assert.assertEquals(bookingperson.isDepositPaid(),actual.booking.isDepositPaid());
        Assert.assertEquals(booknested.getCheckIn(), actual.bookingDates.getCheckIn());
        Assert.assertEquals(booknested.getCheckOut(), actual.bookingDates.getCheckOut());

       // response.then().assertThat().statusCode(201);
    }


}
