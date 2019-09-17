package library;


public class Book {
    public String name;
    public String category;
    public String isbn;
    public boolean isAvailable;
    public Book(String name, String category,String isbn,boolean isAvailable) {
        this.name = name;
        this.category = category;
        this.isbn=isbn;
        this.isAvailable=isAvailable;
    }
}
