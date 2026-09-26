package MovieBooking;

import java.util.List;

public class booking {

    List<ShowSeat> seatList ;
     User userId ;
    int showId ;
   int bid ;

    BookingStatus bookingStatus;

    double amount;


    public booking(List<ShowSeat> seatList, User userId, int showId, int bid, BookingStatus bookingStatus, double amount) {
        this.seatList = seatList;
        this.userId = userId;
        this.showId = showId;
        this.bid = bid;
        this.bookingStatus = bookingStatus;
        this.amount = amount;
    }

    public  void confirmBooking() {
        bookingStatus = BookingStatus.confirmed ;
    }


}
