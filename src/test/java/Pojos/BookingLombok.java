package Pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingLombok {

    public String firstname;
    public String lastname;
    public int totalprice;
    public boolean depositPaid;
    public BookingDates bookingDates;
}
