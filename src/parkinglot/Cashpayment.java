package parkinglot;

public class Cashpayment implements payment{
    @Override
    public int pay(long x , long y) {

        return (int)(y-x)*10 ;
    }
}
