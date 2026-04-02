package Splitwise;

import java.util.List;

public class expense {

    int eid ;
    String desp ;
    double amount ;
    SplitType splitType ;
    User paidbyUser ;


    List<splitUserOwns> splitUserOwns ;

    public expense(int eid , String desp , double amount , SplitType splitType , User paidbyUser , List<splitUserOwns> splitUserOwns){
        this.eid = eid ;
        this.desp = desp ;
        this.amount= amount ;
        this.splitType = splitType ;
        this.paidbyUser = paidbyUser ;
        this.splitUserOwns = splitUserOwns ;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public User getPaidbyUser() {
        return paidbyUser;
    }

    public void setPaidbyUser(User paidbyUser) {
        this.paidbyUser = paidbyUser;
    }

}
