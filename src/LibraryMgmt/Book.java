package LibraryMgmt;

import java.util.List;

public class Book {
    int bid ;
    String bname ;
    BookType bookType ;
    int price ;

    public List<BookCopy> getCopies() {
        return copies;
    }

    public void setCopies(List<BookCopy> copies) {
        this.copies = copies;
    }

    List<BookCopy> copies;

    public Book(int bid, String bname, BookType bookType, int price) {
        this.bid = bid;
        this.bname = bname;
        this.bookType = bookType;
        this.price = price;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
