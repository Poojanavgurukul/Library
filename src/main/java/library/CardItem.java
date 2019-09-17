package library;

public class CardItem {
    Book book;
    public String borrowDate;

    public CardItem(Book bookIsbn, String borrowDate) {
        this.book = bookIsbn;
        this.borrowDate = borrowDate;
    }

    @Override
    public String toString() {
        return "bookId "+book.isbn+" borrowed date: "+borrowDate;
    }
}
