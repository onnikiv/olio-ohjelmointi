package task01;

import java.util.ArrayList;

// - - - - - - - - - Task 1 - - - - - - - - - - - - - - - - - - - - - - - - - - - -
public class Book {
    private final String bookTitle;
    private final String author;
    private final int publicationYear;

    // Task 4 
    private final ArrayList<Double> bookRating;
    private final ArrayList<String> bookReviews;

    public Book(String bookTitle, String author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;

        // Task 4 
        this.bookRating = new ArrayList<>();
        this.bookReviews = new ArrayList<>();
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    // - - - - - - - - - Task 4 - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public void setRating(double rating) {
        this.bookRating.add(rating);
        System.out.println("\"" + this.bookTitle + "\" got a new rating: \"" + rating + "\"");
    }

    // osana Task 5
    public double getRating() {
        double averageRating = 0;
        for (double rating : this.bookRating) {
            averageRating += rating;
        }
        return averageRating;
    }

    public void addReview(String review) {
        this.bookReviews.add(review);
        System.out.println("\"" + this.bookTitle + "\" got a new review: \"" + review + "\"");
    }

    // osana Task 5
    public int getAmountOfReviews() {
        int amountOfReviews = 0;
        for (String bookReview : this.bookReviews) {
            amountOfReviews++;
        }
        return amountOfReviews;
    }
}
