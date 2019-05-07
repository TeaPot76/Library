import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Library library;
    private Book book;
    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        ArrayList<Book> testCollection = new ArrayList<>();
        book1 = new Book("Dead Souls", "Ian Rankin", "crime");
        book2 = new Book("Hanging Garden", "Ian Rankin", "crime");
        book3 = new Book("Knots & Crosses", "Ian Rankin", "crime");
        book4 = new Book("Black and Blue", "Ian Rankin", "crime");

        testCollection.add(book1);
        testCollection.add(book2);
        testCollection.add(book3);
        testCollection.add(book4);

        library = new Library(100, testCollection);

        borrower = new Borrower();
    }

    @Test
    public void canShowSizeOfReadingList(){
        assertEquals(0, borrower.sizeOfReadingList());

    }
    @Test
    public void canAddBookToList(){
        borrower.addBookToList(book);
        assertEquals(1, borrower.sizeOfReadingList());
    }


}
