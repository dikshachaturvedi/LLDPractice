package LibraryMgmt;

public class Fine {
    User user ;
    IssuedBook issuedBook ;
    FineStatus fineStatus ;
    int amount ;
    int fineid ;

    public Fine(User user, IssuedBook issuedBook, FineStatus fineStatus, int amount, int fineid) {
        this.user = user;
        this.issuedBook = issuedBook;
        this.fineStatus = fineStatus;
        this.amount = amount;
        this.fineid = fineid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IssuedBook getIssuedBook() {
        return issuedBook;
    }

    public void setIssuedBook(IssuedBook issuedBook) {
        this.issuedBook = issuedBook;
    }

    public FineStatus getFineStatus() {
        return fineStatus;
    }

    public void setFineStatus(FineStatus fineStatus) {
        this.fineStatus = fineStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFineid() {
        return fineid;
    }

    public void setFineid(int fineid) {
        this.fineid = fineid;
    }
}
