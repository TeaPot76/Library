import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Book> collection;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
        this.genreCount = new HashMap<>();
    }

    public Library(int capacity, ArrayList<Book> collection) {
        this.capacity = capacity;
        this.collection = collection;
    }

    public int numberOfBooksInLibrary(){
        return this.collection.size();
   }

    public void addBookToLibrary(Book book) {
        this.collection.add(book);
        String genre = book.getGenre();
        if (this.genreCount.containsKey(genre)){
            Integer currentCount = this.genreCount.get(genre);
            Integer newCount = currentCount + 1;
            this.genreCount.put(genre, newCount);
        } else {
            this.genreCount.put(genre, 1);
        }
    }

    public void checkIfCanAddBook(Book book) {
        if (this.numberOfBooksInLibrary() >= this.capacity){
            return;
        }
        this.collection.add(book);

    }

    public void lendBook(Borrower borrower, Book book) {
        this.collection.remove(book);
        borrower.addBookToList(book);

    }

    public int numberOfBooksForGenre(String genre) {
        return this.genreCount.get(genre);
    }
}
