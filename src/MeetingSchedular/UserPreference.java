package MeetingSchedular;

import java.util.List;

public class UserPreference implements SchedulingStrategy{

    @Override
    public void findRoom(List<Room> rooms, Meeting meeting) {
        if (rooms == null || meeting == null) return;
        // placeholder strategy: pick first room (extend with user preferences / capacity / availability)
        if (!rooms.isEmpty()) {
            meeting.room = rooms.get(0);
        }
    }
}
