package Ratelimiter;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class slindingWindowLog implements ratelimiter {

    private final int maxrequest ;
    private final  long windowsizemillis ;
    Map<String , Queue<Long>> queue = new ConcurrentHashMap<>();

    public slindingWindowLog(int maxrequest, long windowsizemillis) {
        this.maxrequest = maxrequest;
        this.windowsizemillis = windowsizemillis;
    }

    @Override
    public boolean allowRequest(String u) {
    Queue<Long> requestLog = queue.computeIfAbsent(u , k->new ConcurrentLinkedQueue<>());

    synchronized (requestLog){

        long ct = System.currentTimeMillis();

        long windowBoundary = ct - windowsizemillis ;

        while(!requestLog.isEmpty()  &&  requestLog.peek() <= windowBoundary ){
            requestLog.poll();
        }

        if(requestLog.size() < maxrequest){
            requestLog.add(ct);
            return true ;
        }


    }
        return false;
    }
}
