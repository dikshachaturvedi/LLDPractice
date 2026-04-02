package Atm;

public class Deposit implements Transaction{

    Bank bank ;
    int Txnamount ;
    User user ;

    public Deposit(int txnamount, User user) {
        Txnamount = txnamount;
        this.user = user;
    }

    @Override
    public void execute(User user , CardDetails cardDetails ,atmDetails atmDetails) {
        if(cardDetails.bank == user.bank) {
            boolean flag = user.bank.authorized();
            if (flag ) {
                atmDetails.amount = atmDetails.amount + Txnamount;
                System.out.println("deposit sucees");
            }
        }
    }
}
