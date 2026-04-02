package Atm;

public interface Transaction {
    static final int Txnamount =99;
    public void execute(User user , CardDetails cardDetails ,atmDetails atmDetails) ;
}
