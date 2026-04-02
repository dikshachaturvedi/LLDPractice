package CabBooking;

import java.util.HashMap;
import java.util.List;

public class Booking {
    User user ;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public CabBooking.location getLocation() {
        return location;
    }

    public void setLocation(CabBooking.location location) {
        this.location = location;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    Driver driver ;
    location location;
    int fare ;
    BookingStatus bookingStatus ;

    public Booking(User user, Driver driver, CabBooking.location location, int fare) {
        this.user = user;
        this.driver = driver;
        this.location = location;
        this.fare = fare;
        this.bookingStatus = BookingStatus.pending ;
    }

}
