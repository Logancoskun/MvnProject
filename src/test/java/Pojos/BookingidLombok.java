package Pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingidLombok {

    public int bookingid;
    public Booking booking;
    public BookingDates bookingDates;


}
