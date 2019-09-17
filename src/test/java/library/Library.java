package library;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Library {
    @Test
    public void itShouldGiveBookName() {
        Book book = new Book("Java", "computerScience");
        String actual = book.name;
        assertEquals("Java", actual);
    }
}
