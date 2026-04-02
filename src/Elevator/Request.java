package Elevator;

import java.util.List;
import java.util.PriorityQueue;

public class Request {

    List<int[]> al ;

    int src ;
    int dest ;
    public Request(int dest){
        this.dest = dest ;
    }

    void addRequest(int src , int dest ){
        al.add(new int[]{src , dest});

    }
}
