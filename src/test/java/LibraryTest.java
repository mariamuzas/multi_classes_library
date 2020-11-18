import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    Book book1;
    Book book2;

    @Before
    public void before() {
        library = new Library(10);
        book = new Book("To Kill A Mockingbird", "Harper Lee", "Fiction");
        book1 = new Book("The Diary of Anne Frank", "Anne Frank", "Non-Fiction");
        book2 = new Book("Wuthering Heights", "Emily Bronte", "Fiction");
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(0, library.countBooksInCollection());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.countBooksInCollection());
    }

    @Test
    public void cannotAddMoreBooks() {
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(10, library.countBooksInCollection());
    }

    @Test
    public void canRemovedBookFromCollectio(){
        library.addBook(book);
        library.addBook(book1);
        library.removeBook(book);
        assertEquals(1, library.countBooksInCollection());
    }

}
