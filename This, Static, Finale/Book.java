public class Book {

    // Static variable shared across all books

    static String libraryName = "ABC Library";

    // Final variable to prevent ISBN from overriding

    final String isbn;

    String title;
    String author;

    // Constructor using 'this' to initialize fields

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details after instanceof check

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    // Main method

    public static void main(String[] args) {
        Book b1 = new Book("abc", "def", "123");
        Book b2 = new Book("pqr", "xyz", "456");

        Book.displayLibraryName();
        System.out.println("----------------");
        b1.displayDetails();
        System.out.println("----------------");
        b2.displayDetails();
    }
}