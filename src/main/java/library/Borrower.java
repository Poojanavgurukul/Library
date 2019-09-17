package library;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    List<Book>bag=new ArrayList<>();
    public void borrow(Book book){
        if (book.isAvailable){
            bag.add(book);
        }
    }
    public List<Book> getBag() {
        return bag;
    }
}
