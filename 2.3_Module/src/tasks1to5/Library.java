package tasks1to5;

import java.util.ArrayList;

// - - - - - - - - - Task 1 - - - - - - - - - - - - - - - - - - - - - - - - - - - -
public class Library {

    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println();
        System.out.println("Library Catalog: ");
        int index = 1;
        for (int i = 0; i < books.size(); i++) {
            System.out.println(index + ". Title: \"" + books.get(i).getBookTitle()
                    + "\", Author: \"" + books.get(i).getAuthor() + "\", Year: \"" + books.get(i).getPublicationYear() + "\"");
            index++;
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println("\nBooks by Author \"" + b.getAuthor() + "\":");
                System.out.println("Title: \"" + b.getBookTitle() + "\", Year: \"" + b.getPublicationYear() + "\"");
            }
        }
        System.out.println();
    }

    // - - - - - - - - - Task 2 - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getBookTitle().equals(title)) {
                books.remove(book);
                borrowedBooks.add(book);
                System.out.println("Borrowing book: " + book.getBookTitle());

                break;
            }
        }
    }

    public void returnBook(Book book) {
        System.out.println();

        if (borrowedBooks.contains(book)) {
            System.out.println("Returning book: " + book.getBookTitle());
            books.add(book);
            borrowedBooks.remove(book);

        } else {
            System.out.println("Book: " + book.getBookTitle() + " has already been returned.\n");
        }
    }

    // - - - - - - - - - Task 3 - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getBookTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    // - - - - - - - - - Task 5 - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public void getAverageBookRating() {
        System.out.println();
        System.out.println("Average Book Ratings: ");
        int index = 1;
        for (int i = 0; i < books.size(); i++) {
            System.out.println(index + ". \"" + books.get(i).getBookTitle() + "\"" + ", Average Rating: " + books.get(i).getRating());
            index++;
        }

    }

    public void getMostReviewedBook() {
        System.out.println();

        Book mostReviewedBook = books.get(0);
        for (Book book : books) {
            if (book.getAmountOfReviews() > mostReviewedBook.getAmountOfReviews()) {
                mostReviewedBook = book;
            }
        }
        System.out.println("Most reviewed book: \"" + mostReviewedBook.getBookTitle() + "\" with " + mostReviewedBook.getAmountOfReviews() + " reviews.");
    }

}
