package Splitwise;

import java.util.List;

public class Group {
    int gid ;
    List<User> userList ;
    List<expense> expensesList ;

    public  Group(int gid ,  List<User> userList ,   List<expense> expensesList ){
        this.gid = gid ;
        this.userList = userList ;
        this.expensesList = expensesList ;
    }

}
