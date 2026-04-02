package Atm;

public class Withdraw implements Transaction{

    int Txnamount ;
    User user ;

    public Withdraw(int txnamount, User user) {
        Txnamount = txnamount;
        this.user = user;
    }


    @Override
    public void execute(User user , CardDetails cardDetails ,atmDetails atmDetails) {

        if(cardDetails.bank == user.bank) {
           boolean flag = user.bank.authorized();
            if (flag &&  atmDetails.amount > Txnamount) {
                atmDetails.amount = atmDetails.amount - Txnamount;
                System.out.println("withdraw sucees");
            }
        }
    }
}
