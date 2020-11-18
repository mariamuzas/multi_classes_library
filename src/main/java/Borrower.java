import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int countBooksInCollection() {
        return this.collection.size();
    }

    public void borrowBookFromLibrary(Book book, Library library) {
        Book bookBorrowed = library.removeBook(book);
        this.collection.add(bookBorrowed);
    }
}
