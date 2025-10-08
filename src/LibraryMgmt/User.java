package LibraryMgmt;

import java.util.ArrayList;
import java.util.List;

public class User {
    int uid ;
    List<Book> bl ;

    public User(int uid ){
        this.bl = new ArrayList<>();
        this.uid = uid ;
    }

}
