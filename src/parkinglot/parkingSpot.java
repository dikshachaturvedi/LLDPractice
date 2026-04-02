package parkinglot;

public class parkingSpot {

    vehicle vehicle ;
   vehicle spotId[] = new vehicle[100];
   lookupslot lookupslot ;
    parkingSpot(vehicle vehicle , vehicle[] spotId){
        this.vehicle = vehicle;
        this.spotId = spotId ;
    }
    parkingSpot(){

    }

    void park(){
      //  lookupslot.look();
        for(int i = 0 ;i<spotId.length ;i++){
            if(spotId[i] == null){
                spotId[i] = new vehicle(vehicletype.car , 12345);
            }
        }
    }

    void unpark(int spot ){
        spotId[spot] = null ;
    }

    void isfree(){

    }


}
