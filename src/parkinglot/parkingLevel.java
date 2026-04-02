package parkinglot;

public class parkingLevel {
    parkingSpot parkingSpot ;
    vehicle vehicle ;

    public parkingLevel(parkingSpot parkingSpot , vehicle vehicle){
        this.parkingSpot = parkingSpot ;
        this.vehicle = vehicle ;
    }

    public parkingLevel(){
    }

    void  parking(){
parkingSpot.park();

    }
    void unparking(int x){
        parkingSpot.unpark(x);
    }

    void isfreed(){
        parkingSpot.isfree();
    }


}
