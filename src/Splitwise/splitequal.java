package Splitwise;

import java.util.ArrayList;
import java.util.List;

public class splitequal implements Split{

ArrayList<splitUserOwns> li = new ArrayList<>() ;
    @Override
    public List<splitUserOwns> splitby(double amount, List<User> users) {

        double max = (double)amount/users.size();

        for(User user : users){
            li.add(new splitUserOwns(user , max));
        }

        return li ;
    }

}
