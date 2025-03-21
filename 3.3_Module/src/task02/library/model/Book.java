package task02.library.model;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void getBookInfo() {
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("isbn: " + isbn);
    }
}