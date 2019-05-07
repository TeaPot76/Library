import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book>readingList;

    public Borrower(){
        this.readingList = new ArrayList<>();
    }


    public int sizeOfReadingList() {
        return readingList.size();
    }

    public void addBookToList(Book book) {
        this.readingList.add(book);
    }
}
