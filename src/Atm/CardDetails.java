package Atm;

public class CardDetails {
    String cardNo;
    int PinNo;
    Bank bank ;


    public CardDetails(String cardNo, int pinNo, Bank bank) {
        this.cardNo = cardNo;
        PinNo = pinNo;
        this.bank = bank;
    }

}
