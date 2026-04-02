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
