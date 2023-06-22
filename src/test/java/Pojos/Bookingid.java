package Pojos;

public class Bookingid {
    /*
    {
          "bookingid": 11
          booking": {
             "firstname": "Ahmet",
             "lastname": "Bulut",
             "totalprice": 15000,
             "depositPaid": true,
             "bookingDates": {
              "checkIn": "2022-09-09",
              "checkOut": "2022-09-21"
            }

             }
     */

    public int bookingid;
    public Booking booking;
    public BookingDates bookingDates;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public BookingDates getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates) {
        this.bookingDates = bookingDates;
    }

    public Bookingid() {
    }

    public Bookingid(int bookingid, Booking booking, BookingDates bookingDates) {
        this.bookingid = bookingid;
        this.booking = booking;
        this.bookingDates = bookingDates;
    }

    @Override
    public String toString() {
        return "Bookingid{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                ", bookingDates=" + bookingDates +
                '}';
    }
}
