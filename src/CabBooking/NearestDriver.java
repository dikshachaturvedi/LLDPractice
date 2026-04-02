package CabBooking;

import java.util.List;
import java.util.PriorityQueue;

public class NearestDriver implements AssignDriver{

    @Override
    public  Driver nearest(List<Driver> dr , location Userloc ){


        Driver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;

    for (Driver driver : dr) {
        if (DriverStatus.IDLE == driver.driverStatus) {
            double dist = DistanceCalculator.distance(driver.location, Userloc);

            if (dist < minDistance) {
                minDistance = dist;
                nearestDriver = driver;
            }

        }

    }
    return  nearestDriver ;

    }
}
