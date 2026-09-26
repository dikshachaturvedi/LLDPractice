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


    public void createBooking(User user , List<ShowSeat> ss , Show show){
        // lock
        boolean locked =   seatLockService.lockSeat(ss , user);
        if(!locked) return ;

        // create booking
        booking newBooking = new booking(ss, user, show.showId, bookings.size() + 1, BookingStatus.pending,show.price );
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
    public void cancelBooking(booking b){

        for(booking bk : bookings){
            if(bk == b){
                bk.bookingStatus = BookingStatus.cancelled ;
                seatLockService.releaseLock(b.seatList , b.userId);
                break;
            }
        }
bookings.remove(b);
    }
    public void getAvailbleSeats(){

    }

}
