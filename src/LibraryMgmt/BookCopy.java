package LibraryMgmt;

public class BookCopy {
    Book book ;
    int copyId ;
    BookStatus bookStatus ;

    public BookCopy(Book book, int copyId, BookStatus bookStatus) {
        this.book = book;
        this.copyId = copyId;
        this.bookStatus = bookStatus;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getCopyId() {
        return copyId;
    }

    public void setCopyId(int copyId) {
        this.copyId = copyId;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
