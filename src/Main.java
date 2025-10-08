//package parkinglot;
package LibraryMgmt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
//        parkinglot pl = new parkinglot(0 , 3 , 5 );
//        vehicle v = new car();
//        vehicle v1 = new car();
//        vehicle v2 = new car();
//        pl.findlevelspot(v); pl.findlevelspot(v1); pl.findlevelspot(v2);
//       // parkingspot ps = new parkingspot();
//       // ps.unpark(v2);
//        vehicle v3 = new car();
//        vehicle v4 = new bus();
// pl.findlevelspot(v3); pl.findlevelspot(v4);

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Clean Code", "Robert Martin"));
        books.add(new Book(2, "Design Patterns", "GoF"));
        books.add(new Book(3, "Effective Java", "Joshua Bloch"));
User u = new User(1);
LibraryOperation lio = new LibraryOperation();
lio.borrowed(books.get(0) , u);
        searchstrategy search = new searchbyname(books, lio);
        Book query = new Book(1, "Clean Code", "Robert Martin");

        System.out.println(search.search(books.get(0))
                ? "Book is available!"
                : "Book already borrowed!");

        Book query1 = new Book(1, "Clean Code", "Robert Martin");
        System.out.println(search.search(books.get(0))
                ? "Book is available!"
                : "Book already borrowed!");
    }
}