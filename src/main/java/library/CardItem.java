package library;

public class CardItem {
    Book book;
    private String borrowDate;
    private String returnBookDate;

    @Override
    public String toString() {
        return "bookId ="+book.isbn+" borrowDate= " + borrowDate+" returnBookDate= "+returnBookDate;
    }

    public CardItem(Book bookIsbn, String borrowDate,String returnBookDate) {
        this.book = bookIsbn;
        this.borrowDate = borrowDate;
        this.returnBookDate=returnBookDate;
    }
}
