package MovieBooking;


import MovieBooking.booking;

import java.util.List;

public class User {
    int uid ;
    List<booking> booking ;


    public User(int uid , List<booking> booking){
        this.uid = uid ;
        this.booking = booking ;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public List<MovieBooking.booking> getBooking() {
        return booking;
    }

    public void setBooking(List<MovieBooking.booking> booking) {
        this.booking = booking;
    }
}
