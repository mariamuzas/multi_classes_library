import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("To Kill A Mockingbird", "Harper Lee", "Fiction");
        library.addBook(book);
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(0, borrower.countBooksInCollection());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.countBooksInCollection());
    }
}
