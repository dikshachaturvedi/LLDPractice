package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class parkinglot {

    List<parkinglevel> pl ;

    public parkinglot( int level , int small ,int medium){
        this.pl = new ArrayList<>();
        for(int i = 0 ;i<=level;i++){
            pl.add(new parkinglevel(i , small , medium));
        }
    }

    boolean findlevelspot(vehicle v){
        for(parkinglevel pl : pl){
           parkingspot ps =  pl.findavail(v.getType());
           if( ps!=null && ps.canpark(v) ){
               System.out.println("Parked " + v.getType() + " at level " + pl.level + ", spot " + ps.id);
               return true ;
           }

        }
        System.out.println("No spot available for " + v.getType());
        return false ;
    }


}
