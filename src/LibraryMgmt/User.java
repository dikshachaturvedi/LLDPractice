package LibraryMgmt;

import java.util.ArrayList;
import java.util.List;

public class User {

    String uname ;
    int id ;
    private double totalFineBalance; // Aggregate unpaid balance
    private List<Fine> fines = new ArrayList<>();

    public User(String uname, int id) {
        this.uname = uname;
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
