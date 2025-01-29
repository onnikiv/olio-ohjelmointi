package task01;

public class LibraryMain {


    public static void main(String[] args) {
        
        Library library = new Library();

        Book book1 = new Book("Kalevala","Elias Lönnrot", 1835);
        Book book2 = new Book("Seitsemän veljestä", "Aleksis Kivi", 1870);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
        library.findBooksByAuthor("Elias Lönnrot");
        
        library.borrowBook("Kalevala");
        library.borrowBook("Kalevala");

        library.displayBooks();
        library.returnBook(book1);
        
        library.displayBooks();
        library.returnBook(book1);

        book1.addReview("Hullu kirja!");
        book1.addReview("Putosin tuolista, kun luin tän kirjan!");

        book2.addReview("ooÄmGee");
        book2.setRating(3);

        book1.setRating(2);
        book1.setRating(4);

        library.getMostReviewedBook();


    }
}
