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

 public int getScid() {
  return scid;
 }

 public void setScid(int scid) {
  this.scid = scid;
 }

 public Map<Show, List<ShowSeat>> getShowSeatMap() {
  return showSeatMap;
 }

 public void setShowSeatMap(Map<Show, List<ShowSeat>> showSeatMap) {
  this.showSeatMap = showSeatMap;
 }
}
