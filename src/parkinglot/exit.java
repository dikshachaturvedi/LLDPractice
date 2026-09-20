package parkinglot;

public class exit {

    vehicle v ;
    parkinglotManager plm ;
    Ticket t ;
    payment pay;
    long exittime ;
    public exit(vehicle v , parkinglotManager plm , Ticket t , payment pay){
        this.v = v ;
        this.plm = plm ;
        this.t = t ;
        this.pay = pay ;
        exittime = System.currentTimeMillis();
    }

   public int payt(){
        plm.unparking(t , t.getSpotId() );
     return    pay.pay(  t.getEntrytime() , exittime );

    }




}
