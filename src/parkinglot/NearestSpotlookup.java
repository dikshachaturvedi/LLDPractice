package parkinglot;

import java.util.List;

public class NearestSpotlookup implements lookupslot{
    @Override
   public parkingSpot  look(List<parkingSpot> ps) {

        for(parkingSpot pp :ps){
            if(pp.isfree){
                return pp;
            }
        }
        return null ;
    }
}
