package parkinglot;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        parkinglot pl = new parkinglot(0 , 3 , 5 );
        vehicle v = new car();
        vehicle v1 = new car();
        vehicle v2 = new car();
        pl.findlevelspot(v); pl.findlevelspot(v1); pl.findlevelspot(v2);
       // parkingspot ps = new parkingspot();
       // ps.unpark(v2);
        vehicle v3 = new car();
        vehicle v4 = new bus();
 pl.findlevelspot(v3); pl.findlevelspot(v4);
    }
}