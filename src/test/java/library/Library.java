package library;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Library {
    @Test
    public void itShould    () {
        Book book = new Book("Java", "computerScience","i12",true);
        String actual = book.name;
        assertEquals("Java", actual);
    }
}
