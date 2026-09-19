package parkinglot;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class parkingLevel {
    List<parkingSpot> parkingSpot ;
   // vehicle vehicle ; not here beacuse vehicle isntostrnngly relatedto parking level
    lookupslot lookupslot ;
    private AtomicInteger availableSpotsCount;
    public parkingLevel(List<parkingSpot> parkingSpot ,  lookupslot lookupslot){
        this.parkingSpot = parkingSpot ;
        this.lookupslot = lookupslot ;
        this.availableSpotsCount = new AtomicInteger(parkingSpot.size());
    }

    public parkingLevel(){
    }

    parkingSpot  parking(vehicle vehicle){

        if(availableSpotsCount.get()<=0) return null ;
        while(availableSpotsCount.get()>0){
            parkingSpot ps = lookupslot.look(parkingSpot) ;
            if(ps == null) return null ;
            if(ps.park(vehicle)) {
                availableSpotsCount.decrementAndGet();
                return ps ;
            }

        }

return null ;
    }

    boolean unparking(int spotId ){
for(parkingSpot pss : parkingSpot){
    if(pss.spotId == spotId){
        pss.unpark();
        return true;
    }

}
return false ;


    }



}
