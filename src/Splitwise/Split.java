package Splitwise;

import java.util.List;

public interface Split {

    public List<splitUserOwns> splitby(double amount , List<User> users);
    
}
