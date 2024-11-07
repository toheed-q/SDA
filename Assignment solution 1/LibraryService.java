
package Service;

import Model.Book;
import Model.Librarian;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private User user;
    private Librarian librarian;

    public LibraryService(User user, Librarian librarian) {
        this.user = user;
        this.librarian = librarian;
    }

    public void addBook(Book book) {
        books.add(book);
        book.addObserver(user);
        book.addObserver(librarian);
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrow();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}
