package Pojos;

public class Booking {
    /*
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
    public String firstname;
    public String lastname;
    public int totalprice;
    public boolean depositPaid;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public Booking() {

    }

    public Booking(String firstname, String lastname, int totalprice, boolean depositPaid) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositPaid = depositPaid;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositPaid=" + depositPaid +
                '}';
    }
}
