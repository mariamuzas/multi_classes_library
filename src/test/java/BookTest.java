import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("To Kill A Mockingbird", "Harper Lee", "Fiction" );
    }

    @Test
    public void bookHasAName() {
        assertEquals("To Kill A Mockingbird", book.getTitle());
    }
    @Test
    public void bookHasAuthor() {
        assertEquals("Harper Lee", book.getAuthor());
    }
    @Test
    public void bookHasAGenre() {
        assertEquals("Fiction", book.getGenre());
    }
}
