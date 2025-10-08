package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class parkinglevel {
    List<parkingspot> ps ;
    int level , small , med ;


    public  parkinglevel(int level , int small , int med ){
        this.level = level ;
        this.med = med ;
        this.small = small ;
        this.ps = new ArrayList<>();

        for(int i = 0 ;i<small;i++){
            ps.add(new parkingspot(200+i , vtype.car , 20));
        }
        for(int i = 0 ;i<med;i++){
            ps.add(new parkingspot(300+i , vtype.bus , 50));
        }
    }


    parkingspot findavail(vtype vtype){

        for(parkingspot pst : ps){
            if(pst.isfree() && pst.spottype == vtype){
                return pst ;
            }
        }
        return null ;
    }



}
