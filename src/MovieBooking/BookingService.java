package MovieBooking;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<booking> bookings = new ArrayList<>();

    private SeatLockService seatLockService;
    Payment payment ;

    public BookingService(SeatLockService seatLockService , Payment payment) {
        this.seatLockService = seatLockService;
        this.payment = payment ;
    }


    public void createBooking(User user , List<ShowSeat> ss){
        // lock
        boolean locked =   seatLockService.lockSeat(ss , user);
        if(!locked) return ;

        // create booking
        booking newBooking = new booking(ss, user, 123, bookings.size() + 1, BookingStatus.pending,200 );
        // payment
        boolean done = payment.makePayment(user , 200);
        if(done){
            newBooking.confirmBooking();
            for(ShowSeat showSeat : ss){
                showSeat.seatStatus = SeatStatus.BOOKED ;
            }
            bookings.add(newBooking);
        }else{
            seatLockService.releaseLock(ss, user);
        }

    }
    public void cancelBooking(){


    }
    public void getAvailbleSeats(){

    }

}
