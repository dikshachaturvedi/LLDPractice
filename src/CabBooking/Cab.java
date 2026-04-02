package CabBooking;

public class Cab {
    String id ;

    public Cab(String id, Cabtype cabtype) {
        this.id = id;
        this.cabtype = cabtype;
    }

    Cabtype cabtype ;
}
