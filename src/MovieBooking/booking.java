package MovieBooking;

import java.util.List;

public class booking {

    List<seat> seatList ;
    int userId ;
    int showId ;
   int bid ;
   payment payment ;
    bookingStatus bookingStatus;

    double amount;

    public  booking(int bid , show show , List<seat> seatList , theater theater , location location ){
        this.bid = bid ;
        this.seatList = seatList ;
    //    this.theater = theater ;
       // this.show = show ;
     //   this.location = location ;
    }

    void booking(){
        // choose location

        // choose theater
        //choose show
        // book
        //payment
    }

}
