package Atm;

public class Bank {
    String bid ;
    String bankName ;
    int amount ;
    public Bank(String bid, String bankName, int amount) {
        this.bid = bid;
        this.bankName = bankName;
        this.amount = amount;
    }

    boolean authorized(){
        System.out.println("auth");
        return true ;
    }
}
