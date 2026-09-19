package parkinglot;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class parkinglotManager {
    private static parkinglotManager parkinglotManager;

    List<parkingLevel> pl;
    AtomicInteger ticketId = new AtomicInteger(1000);
    private final ConcurrentHashMap<String,Ticket > tmap = new ConcurrentHashMap<>();
    
    private parkinglotManager(){
        // Private constructor for singleton pattern
    }
    
    public static synchronized parkinglotManager getInstance(){
        if(parkinglotManager == null)
            parkinglotManager = new parkinglotManager();
        return parkinglotManager;
    }
    
    public void initialize(List<parkingLevel> pl){

        this.pl = pl;
    }

    public void addLevel(){
        if(pl != null)
            pl.add(new parkingLevel());
    }

    public Ticket parking(vehicle v){
        for(parkingLevel pkl : pl){
            if(pkl.parking(v)!=null){

                String ttid = "TICK-" + ticketId.incrementAndGet();
                Ticket t = new Ticket( ttid , v , pkl.parking(v).spotId );
                tmap.put(ttid , t);
                return t ;
            }
        }
        return null;
    }
    
    public boolean unparking(Ticket t , int spotId ){

        // Remove ticket atomically; returns null if ticketId wasn't found or already processed
        Ticket ticket = tmap.remove(ticketId);
        if (ticket == null) {
            return false; // Invalid or already paid ticket
        }

        if (pl != null) {
            for (parkingLevel level : pl) {
                if (level.unparking(spotId)) {
                    return true;
                }
            }
        }

        return false;
    }



}
