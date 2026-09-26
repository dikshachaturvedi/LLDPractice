package MovieBooking;

public class ShowSeat {
    int seatId ;
    SeatType seattype ;
    SeatStatus seatStatus ;
    long lockExpiryTime;
    User lockedBy;


    public ShowSeat(int seatId, SeatType seattype , SeatStatus seatStatus) {
        this.seatId = seatId;
        this.seattype = seattype;
        this.seatStatus = seatStatus;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public SeatType getSeattype() {
        return seattype;
    }

    public void setSeattype(SeatType seattype) {
        this.seattype = seattype;
    }


}
