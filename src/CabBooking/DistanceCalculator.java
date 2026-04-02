package CabBooking;

public class DistanceCalculator {

    public static double distance(location a, location b) {
        double dx = a.latitude - b.latitude;
        double dy = a.longitude - b.longitude;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
