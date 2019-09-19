package library;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Library {
    public static void main(String[] args) {
        Book book=new Book("Java","CS","12A",true);
        Book book2=new Book("Two States","Novel","13I",false);
        List<Book>collection= new ArrayList<>();
        collection.add(book);
        collection.add(book2);

        Borrower borrower=new Borrower();
        borrower.borrow(book);
        borrower.borrow(book2);
        borrower.returnBook(book);

        SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
        dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
        Card card=new Card();
        for (Book books:borrower.getBag()) {
         CardItem cardItem=new CardItem(books,dateTimeInGMT.format(new Date()),null);
         card.addDetail(cardItem);
        }
        System.out.println("--------------------------------------------------------------------------");

        for (CardItem item:card.getDetail()) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------------------------------------------");
    }
}
