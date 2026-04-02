package CabBooking;

import java.util.ArrayList;

public class Driver {


    String id ;
    String name ;
     location location;
    DriverStatus driverStatus ;

    public Driver(String id, String name, location location, DriverStatus driverStatus) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.driverStatus = driverStatus;
    }


}
