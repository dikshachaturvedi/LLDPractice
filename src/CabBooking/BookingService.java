package CabBooking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BookingService {
AssignDriver assignDriver ;
ArrayList<Driver> drivers  = new ArrayList<>();
Queue<Booking> bookingQueue = new LinkedList<>();
 public void  addbookingQueue(Booking b ){
        bookingQueue.add(b);
    }


 public void  addDriverList(Driver driver){
        drivers.add(driver);
    }
 public void  notifyDrivers(List<Driver> driverList , Booking booking){
        Driver d = assignDriver.nearest(driverList , booking.user.userLoc );
        booking.setDriver(d);
        acceptBooking(booking);

    }
 public void  acceptBooking(Booking booking){

        booking.bookingStatus = BookingStatus.accepted ;
        notifyUser(booking);
    }

 public void  notifyUser(Booking booking){
        if(booking.bookingStatus == BookingStatus.accepted){
            System.out.println("driver comming");

        }else if(booking.bookingStatus == BookingStatus.cancelled) {
            //notifyDriver(booking);
        }
    }
 public void  notifyDriver(Booking booking){
        if(booking.bookingStatus == BookingStatus.cancelled){
          //  System.println.out("ride cancels");
            booking.setDriver(null);

        }
    }
 public void  cancelBooking(Booking booking){
        booking.bookingStatus = BookingStatus.cancelled;
        notifyDriver(booking);
    }
 public void  bookingstart(Booking booking){
        booking.driver.driverStatus = DriverStatus.Busy ;
    }
 public void  boodingdone(Booking booking){
        booking.driver.driverStatus = DriverStatus.IDLE ;
        booking.bookingStatus = BookingStatus.done ;
        int fare = calculatefare();

    }
    int  calculatefare(){
        return 5 ; // just dummy valie
    }

}
