package Splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class splitwiseService {

    ArrayList<User> li = new ArrayList<>();
    ArrayList<expense> expenses = new ArrayList<>();
    BalanceSheet sheet = new BalanceSheet();

   public ArrayList<User> addUser(User user){
        li.add(user);
        return li ;
    }

    public ArrayList<expense> addExpense(expense expense){
        expenses.add(expense);
        return expenses ;
    }


    public  void  mapbalnce(expense expense){
        User paidbyUser = expense.paidbyUser;
        List<splitUserOwns> splitUserOwnsList = expense.splitUserOwns;

//        for(splitUserOwns sp ; splitUserOwnsList){
//            sheet.balances(paidbyUser , sp.user , sp.aDouble);
//        }
    }
    public  BalanceSheet balances(){
       return  sheet ;
    }

}
/*class SplitwiseService {
    Map<String, User> users = new HashMap<>();
    Map<String, Group> groups = new HashMap<>();
    BalanceSheet balanceSheet = new BalanceSheet();
    SettlementStrategy settlementStrategy;

    public SplitwiseService(SettlementStrategy settlementStrategy) {
        this.settlementStrategy = settlementStrategy;
    }

    public void addUser(User user) {
        users.put(user.userId, user);
    }

    public void addGroup(Group group) {
        groups.put(group.groupId, group);
    }

    public void addExpense(Expense expense) {
        validateExpense(expense);
        applyExpense(expense);
    }


    private void validateExpense(Expense expense) {
        double total = 0.0;

        for (Split split : expense.splits) {
            total += split.amount;
        }

        if (Math.abs(total - expense.amount) > 0.001) {
            throw new IllegalArgumentException("Invalid split total");
        }
    }

    private void applyExpense(Expense expense) {
        User payer = expense.paidBy;

        for (Split split : expense.splits) {
            User user = split.user;

            if (user.userId.equals(payer.userId)) {
                continue; // payer apna हिस्सा khud ko nahi dega
            }

            balanceSheet.updateBalance(payer, user, split.amount);
        }
    }
        public List<Transaction> settleBalances() {
        return settlementStrategy.settle(balanceSheet);
    }

}

 */