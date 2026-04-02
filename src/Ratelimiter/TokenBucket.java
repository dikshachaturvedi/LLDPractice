package Ratelimiter;

import java.util.HashMap;

public class TokenBucket implements ratelimiter{
    HashMap<String , Bucket> hm = new HashMap<>();
    @Override
    public boolean allowRequest(String u) {
        Bucket b = hm.computeIfAbsent(u , i -> new Bucket(1,2,3,5));
        b.refill();

        if(b.token>0){
            b.token--;
            return  true ;
        }
        return false;
    }
}
