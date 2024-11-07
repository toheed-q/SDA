
package LMS;


import Model.Book;
import Model.Librarian;
import Model.User;
import Service.LibraryService;

public class Main {
    public static void main(String[] args) {
        User user = new User("Toheed");
        Librarian librarian = new Librarian("ABC");
        Librarian librarian2 = new Librarian("Ali");

        LibraryService libraryService = new LibraryService(user, librarian);
        LibraryService libraryService2 = new LibraryService(user, librarian);
        
        Book book1 = new Book("Java Programming", true);
        Book book2 = new Book("Design Patterns", false); 
        Book book3 = new Book("C++",true);

        libraryService.addBook(book1);
        libraryService.addBook(book2);
  libraryService.addBook(book3);
        libraryService.borrowBook("Java Programming"); 
        libraryService.borrowBook("Design Patterns"); 
         libraryService.borrowBook("C++"); 
    }
}
