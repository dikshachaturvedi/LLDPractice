package parkinglot;

public class exit {

    vehicle v ; parkinglotManager plm ; Ticket t ; payment pay;
    long exittime ;
    public exit(vehicle v , parkinglotManager plm , Ticket t , payment pay){
        this.v = v ;
        this.plm = plm ;
        this.t = t ;
        this.pay = pay ;
    }

    int payt(){
     return    pay.pay(  t.entrytime , exittime );
    }




}
