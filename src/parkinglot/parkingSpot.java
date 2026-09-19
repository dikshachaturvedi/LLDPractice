package parkinglot;

public class parkingSpot {

    vehicle vehicle ;
      int spotId;
      boolean isfree ;

    parkingSpot(vehicle vehicle , int spotId){
        this.vehicle = vehicle;
        this.spotId =   spotId ;
    }
    parkingSpot(){

    }

    boolean park(vehicle v){

    if(isfree) {
        this.vehicle = v;
        this.isfree = false ;
return true ;
    }else
    this.isfree = true ;
    return false ;
    }

    void unpark(){
    if(!isfree){
    this.vehicle = null ;
    this.isfree = true ;
}

    }




}
