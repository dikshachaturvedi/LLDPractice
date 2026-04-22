package MeetingSchedular;

import java.util.List;

public class Room {
    int roomid ;
    List<Interval> li ;
    int cap ;


    public Room(int roomid, List<Interval> li, int cap) {
        this.roomid = roomid;
        this.li = li;
        this.cap = cap;
    }

    public boolean isAvailable(Interval interval){

        return true;
    }

   public void addBooking(Interval interval){

    }

}
