package MovieBooking;

import java.util.List;
import java.util.Map;

public class Screen {
 int scid ;
 Map<Show, List<ShowSeat>> showSeatMap;

 public Screen(int scid, Map<Show,  List<ShowSeat>> showSeatMap) {
  this.scid = scid;
  this.showSeatMap = showSeatMap;
 }
}
