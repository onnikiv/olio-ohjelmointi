package task03.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {

    private final String name;
    private final int memberId;
    private static int memberCount = 0;
    private final ArrayList<Book> borrowedBooks;

    private final ArrayList<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name) {
        this.name = name;
        this.memberId = memberCount;
        this.borrowedBooks = new ArrayList<>();

        memberCount++;
    }

    public String getMemberName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void addToBorrowedBooks(Book book) {
        borrowedBooks.add(book);
    }

    public void removeFromBorrowedBooks(Book book) {
        borrowedBooks.remove(book);
    }

    public boolean checkBookBorrowed(Book book) {
        return this.borrowedBooks.contains(book);
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
