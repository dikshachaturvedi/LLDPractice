package Atm;

public interface AtmState {

    public void insertCard(atmDetails atmDetails , int amt , CardDetails cardDetails);
    public void enterpin(atmDetails atmDetails , int amt ,CardDetails cardDetails);
    public  void selectTxn(atmDetails atmDetails , Transaction txn);
    public void withdraw(atmDetails atmDetails , int amt);
    public void deposit(atmDetails atmDetails , int amt);
    public void  ejectCard(atmDetails atmDetails );
}
