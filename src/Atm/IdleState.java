package Atm;

public class IdleState  implements  AtmState{
    @Override
    public void insertCard(atmDetails atmDetails, int amt, CardDetails cardDetails) {
atmDetails.setCardDetails(cardDetails);
atmDetails.setAtmState(new HasCard());
System.out.println("card inserted");
    }

    @Override
    public void enterpin(atmDetails atmDetails, int amt, CardDetails cardDetails) {
        System.out.println("Insert card first");
    }

    @Override
    public void selectTxn(atmDetails atmDetails, Transaction txn) {
        System.out.println("Insert card first");
    }

    @Override
    public void withdraw(atmDetails atmDetails, int amt) {
        System.out.println("Insert card first");
    }

    @Override
    public void deposit(atmDetails atmDetails, int amt) {
        System.out.println("Insert card first");
    }

    @Override
    public void ejectCard(atmDetails atmDetails) {
        System.out.println("No card ");
    }
}
