package parkinglot;
import java.util.HashMap;
import java.util.List;

public class parkinglotManager {
    private static parkinglotManager parkinglotManager;
    vehicle v;
    Ticket t;
    List<parkingLevel> pl;
    exit exit;
    
    private parkinglotManager(){
        // Private constructor for singleton pattern
    }
    
    public static synchronized parkinglotManager getInstance(){
        if(parkinglotManager == null)
            parkinglotManager = new parkinglotManager();
        return parkinglotManager;
    }
    
    public void initialize(vehicle v, List<parkingLevel> pl, Ticket t){
        this.v = v;
        this.t = t;
        this.pl = pl;
    }
    public void addLevel(){
        if(pl != null)
            pl.add(new parkingLevel());
    }

    public void parking(parkingLevel level){
        if(pl != null){
            for(parkingLevel lev : pl){
                if(lev == level){
                    lev.parking();
                    break;
                }
            }
        }
    }
    
    public void unparking(parkingLevel level, int spotId){
        // unparklogic
        // call exit();
        if(pl != null){
            for(parkingLevel lev : pl){
                if(lev == level){
                    lev.unparking(spotId);
                    break;
                }
            }
        }
    }

    public boolean isFree(){
        // look if spotId is free
        return true;
    }


}
