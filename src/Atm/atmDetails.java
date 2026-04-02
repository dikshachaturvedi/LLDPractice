package Atm;

public class atmDetails {
    String atmId ;
    int amount ;
    CardDetails cardDetails ;
    Bank bank ;


    AtmState atmState ;

    public atmDetails(String atmId, int amount, Bank bank) {
        this.atmId = atmId;
        this.amount = amount;
        this.bank = bank;
    }

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CardDetails getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(CardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public AtmState getAtmState() {
        return atmState;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }







}
