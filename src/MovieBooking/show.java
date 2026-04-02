package MovieBooking;

import java.util.Map;

public class show {
    movie movie;
    int starttime ;
    int endtime ;

    private final Map<String, seat> seats; // seatId -> Seat

    seat seatAvailble ;
    public  show(movie movie , int starttime , int endtime , Map<String, seat> seats){
        this.movie = movie ;
        this.starttime = starttime ;
        this.endtime = endtime ;
        this.seats = seats ;
    }

    public Map<String, seat> getSeats() {
        return seats;
    }

}
