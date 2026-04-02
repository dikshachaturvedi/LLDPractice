package Ratelimiter;

import java.time.Instant;

public class Bucket {
    int token;
    int time ;
    int cap ;
    int refil;

    public Bucket(int token, int time, int cap, int refil) {
        this.token = token;
        this.time = time;
        this.cap = cap;
        this.refil = refil;
    }
    int refill(){
       int curr =  1243 ;
        int rate = (curr - time)*refil ;
      token =   Math.min(cap , token + rate );
      return token ;
    }
}
