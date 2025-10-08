package LibraryMgmt;

import java.util.HashMap;
import java.util.List;

public class LibraryOperation {
HashMap<Integer , User> mp ;

public LibraryOperation(){
    this.mp = new HashMap<>() ;
}
    void borrowed( Book b , User u){
        mp.put(b.bid , u);

    }
    void returnbook( Book b , User u){
        mp.remove(b.bid);
    }

    boolean isavail(Book b){
        if(mp.containsKey(b.bid)){
            return false;
        }
        return true ;
    }
}
