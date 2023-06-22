package Pojos;

public class BookingDates {

    /*
    "bookingDates": {
              "checkIn": "2022-09-09",
              "checkOut": "2022-09-21"
            }
     */
    public String checkIn;
    public String checkOut;

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public BookingDates() {

    }

    public BookingDates(String checkIn, String checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "BookingDates{" +
                "checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                '}';
    }
}
