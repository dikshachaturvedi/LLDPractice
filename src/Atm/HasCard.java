package Atm;

public class HasCard implements AtmState{
    @Override
    public void insertCard(atmDetails atmDetails, int amt, CardDetails cardDetails) {
        System.out.println("card already exist ");
    }

    @Override
    public void enterpin(atmDetails atmDetails, int pin , CardDetails cardDetails) {

        if(cardDetails.PinNo == pin){
            atmDetails.setAtmState(new SelectTxnType());
        }else{
            System.out.println("worng pin");
            atmDetails.setCardDetails(null);
            atmDetails.setAtmState(new IdleState());
        }

    }

    @Override
    public void selectTxn(atmDetails atmDetails, Transaction txn) {
        System.out.println("enter Pin first");
    }

    @Override
    public void withdraw(atmDetails atmDetails, int amt) {
        System.out.println("enter Pin first");
    }

    @Override
    public void deposit(atmDetails atmDetails, int amt) {
        System.out.println("enter Pin first");
    }

    @Override
    public void ejectCard(atmDetails atm) {

        atm.setCardDetails(null);
        atm.setAtmState(new IdleState());
        System.out.println("Card ejected");
        System.out.println("ejected!");
    }
}
