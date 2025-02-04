package task02.library;

import task02.library.model.*;
import task02.library.system.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        // Add books and members to the library
        // Perform borrowing and returning operations

        Library library = new Library();

        Book book1 = new Book("Harry Potter 1", "J.K. Rowling", "978-0747532699");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0261102217");
        Book book3 = new Book("1984", "George Orwell", "978-0451524935");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        LibraryMember user1 = new LibraryMember("Jorma");
        LibraryMember user2 = new LibraryMember("Ernesto");
        LibraryMember user3 = new LibraryMember("Lauri");

        System.out.println();

        library.addMember(user1);
        library.addMember(user2);
        library.addMember(user3);

        System.out.println();

        library.borrowBook(user3, book3);
        library.borrowBook(user1, book3);

        library.returnBook(user3, book3); // testausta
        library.returnBook(user3, book3);

        library.borrowBook(user1, book3); // toinen ukko lainaa nyt
        
    }
}