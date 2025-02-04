package task03.library.system;

import java.util.ArrayList;
import task03.library.model.*;

public class Library {
    private final ArrayList<Book> books;
    private final ArrayList<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("That Book is already in the system...");
        } else {
            books.add(book);
            book.getBookInfo();
            System.out.print("added to library... \n");
        }
    }

    public void addMember(LibraryMember member) {
        if (members.contains(member)) {
            System.out.println("That Member is already in the system...");
        } else {
            members.add(member);
            System.out.println("Name: " + member.getMemberName() + " - Id: " + member.getMemberId() + " added.");
        }
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            member.addToBorrowedBooks(book);
            books.remove(book);
            System.out.println(member.getMemberName() + " is now borrowing book " + book.getTitle());
        } else {
            System.out.println("Book: " + book.getTitle() + " is not in the system");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.checkBookBorrowed(book)) {
            member.removeFromBorrowedBooks(book);
            books.add(book);
            System.out.println(member.getMemberName() + " has returned book " + book.getTitle());
        } else {
            System.out.println("Cannot return Book: " + book.getTitle() + " // not in the system.");
        }
    }


    public void reserveBook(LibraryMember member, Book book) {
        if (!book.checkReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.checkReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getMemberName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
