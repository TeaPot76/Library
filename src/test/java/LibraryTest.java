import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {


    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(100);

        book1 = new Book("Dead Souls", "Ian Rankin", "crime");
        book2 = new Book("Hanging Garden", "Ian Rankin", "crime");
        book3 = new Book("Knots & Crosses", "Ian Rankin", "crime");
        book4 = new Book("Black and Blue", "Ian Rankin", "crime");

        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book4);


        borrower = new Borrower();
    }

    @Test
    public void seeNumberOfBooksInLibrary(){
        assertEquals(4, library.numberOfBooksInLibrary());
    }
    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book1);
        assertEquals(5, library.numberOfBooksInLibrary());
        assertEquals(5, library.numberOfBooksForGenre("crime"));

    }

    @Test
    public void cantAddMoreThanCapacity() {
        for (int i = 0; i<120; i++) {
            library.checkIfCanAddBook(book1);
        }
        assertEquals(100, library.numberOfBooksInLibrary());
    }

    @Test
    public void canBorrowBook(){
        library.lendBook(borrower, book1);
        assertEquals(3, library.numberOfBooksInLibrary());
        assertEquals(1, borrower.sizeOfReadingList());

    }

}
