package library;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    List<Book> bag = new ArrayList<>();

    public void borrow(Book book) {
        if (book.isAvailable) {
            bag.add(book);
            book.isAvailable = false;
        }
        else {
            System.out.println(book.name+" is not Available");
        }
    }

    public void returnBook(Book book) {
        book.isAvailable=true;
    }

    public List<Book> getBag() {
        return bag;
    }
}
