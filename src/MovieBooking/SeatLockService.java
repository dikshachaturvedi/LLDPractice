package MovieBooking;

import java.util.List;

public class SeatLockService {
    private static final long LOCK_TIME = 5 * 60 * 1000;
  synchronized   boolean lockSeat(List<ShowSeat> showSeats , User user){

        for(ShowSeat showSeat :showSeats){

            if (isLockExpired(showSeat)) {
                showSeat.seatStatus = SeatStatus.AVAILABLE;
                showSeat.lockedBy = null;
            }

            if (showSeat.seatStatus != SeatStatus.AVAILABLE) {
                return false;
            }
        }

        for(ShowSeat showSeat :showSeats){
            showSeat.seatStatus = SeatStatus.LOCKED ;
            showSeat.lockedBy = user;
            showSeat.lockExpiryTime = System.currentTimeMillis() + LOCK_TIME;

        }
        return true ;
    }

    boolean releaseLock(List<ShowSeat> showSeats , User user){

        for(ShowSeat showSeat :showSeats){
            showSeat.seatStatus = SeatStatus.AVAILABLE ;

        }
        return true ;
    }

    private boolean isLockExpired(ShowSeat seat) {

        return seat.seatStatus == SeatStatus.LOCKED
                && System.currentTimeMillis() > seat.lockExpiryTime;
    }

}
