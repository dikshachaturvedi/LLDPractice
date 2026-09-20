package Ratelimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class slidiingWindowCounter implements ratelimiter{


    private final int maxRequests;
    private final long windowSizeInMillis;
    final Map<String , ClientWindowState> cmap = new ConcurrentHashMap<>();

    public slidiingWindowCounter(int maxRequests, long windowSizeInMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInMillis;
    }

    @Override

    public boolean allowRequest(String u) {
        long ct = System.currentTimeMillis();
        long windowstart =  ct - (ct%windowSizeInMillis); //e.g., rounding 12:01:42 down to 12:01:00


     ClientWindowState state  =  cmap.computeIfAbsent(u ,k-> new ClientWindowState(windowstart));

     synchronized(state){
advanceWindow( state , windowstart);

long tpct = ct - state.getCurrentWindowStartTimestamp() ;
double cww = tpct/(double)windowSizeInMillis ;
double previous = 1.0-cww ;

long estimatedRequest = (long)previous * state.getPreviousWindowCounter().get() + state.getCurrentWindowCounter().get() ;

if(estimatedRequest < maxRequests){
    state.getCurrentWindowCounter().incrementAndGet();
    return true ;
}

     }




        return false;
    }

    void advanceWindow(ClientWindowState state , long windowstart){
        long elapsed = windowstart - state.getCurrentWindowStartTimestamp() ;
        if(elapsed == 0)
            return ;

        if(elapsed == windowSizeInMillis){

            // Shift current counter to previous and reset current counter
            state.setPreviousWindowCounter(state.getCurrentWindowCounter());
            state.setCurrentWindowCounter(new AtomicInteger(0));
        }else{
            state.setPreviousWindowCounter(new AtomicInteger(0));
            state.setCurrentWindowCounter(new AtomicInteger(0));
        }

    }
}
