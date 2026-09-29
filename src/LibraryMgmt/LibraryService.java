package LibraryMgmt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibraryService {

    public List<IssuedBook> issueBook(
            User user,
            Map<Book, Integer> books) {

        List<IssuedBook> issuedBooks = new ArrayList<>();

        for (Map.Entry<Book, Integer> entry : books.entrySet()) {

            Book book = entry.getKey();
            int quantity = entry.getValue();

            for (int i = 0; i < quantity; i++) {

                BookCopy copy = searchAvailableCopy(book);

                if (copy == null) {
                    return null;
                }

                copy.setBookStatus(BookStatus.Issued);

                IssuedBook issuedBook = new IssuedBook(
                        user,
                        copy,
                        123,
                        1234,
                        0
                );

                issuedBooks.add(issuedBook);
            }
        }

        return issuedBooks;
    }


    public void returnBook(IssuedBook issuedBook) {

        BookCopy copy = issuedBook.getBookCopy();

        copy.setBookStatus(BookStatus.Available);

        issuedBook.setReturnDate(3433);
    }


    private BookCopy searchAvailableCopy(Book book) {

        for (BookCopy copy : book.getCopies()) {

            if (copy.getBookStatus() == BookStatus.Available) {
                return copy;
            }
        }

        return null;
    }
}