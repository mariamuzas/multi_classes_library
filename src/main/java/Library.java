import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<Book, String> fictionCollection;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
        this.fictionCollection = new HashMap<>();
    }

    public int countBooksInCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (countBooksInCollection() < this.capacity) {
            this.collection.add(book);
        }
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }

    public void addFictionBooks() {
        fictionCollection.put()
    }
}
