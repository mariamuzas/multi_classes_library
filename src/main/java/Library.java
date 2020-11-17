import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooksInCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (countBooksInCollection() < this.capacity) {
            this.collection.add(book);
        }
    }
}
