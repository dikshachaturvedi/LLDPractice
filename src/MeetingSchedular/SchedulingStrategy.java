package MeetingSchedular;

import java.util.List;

public interface SchedulingStrategy {

   public void findRoom(List<Room> rooms, Meeting meeting) ;
}
