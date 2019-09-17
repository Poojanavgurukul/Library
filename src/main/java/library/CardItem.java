package library;

import java.util.Date;
public class CardItem {
    Book book;
    public String borrowDate;

    public CardItem(Book book, String borrowDate) {
        this.book = book;
        this.borrowDate = borrowDate;
    }

    @Override
    public String toString() {
        return book + borrowDate;
    }
}
