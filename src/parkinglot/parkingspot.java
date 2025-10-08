package parkinglot;

public class parkingspot {
    int id ;
    int fare ;
    vtype spottype;
    boolean free;
    vehicle v ;


    public parkingspot(int id , vtype spottype ,  int fare ){
        this.id = id ;
        this.spottype = spottype ;
        this.fare = fare ;
        this.free = true ;
    }
    public parkingspot( ){

    }


    boolean canpark(vehicle v){

        if(isfree() && spottype == v.getType()){
            this.free = false ;
            this.v = v ;
            return true;
        }
        return false ;

    }

    void unpark(vehicle v ){
        this.free = true ;
        this.v = null ;
    }

    boolean isfree(){
        return free;
    }
}
