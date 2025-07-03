public class Library {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You've successfully borrowed \"" + title + "\" by " + author);
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Library book1 = new Library("The Java Handbook", "M. Sharma", 499.99);
        
        book1.displayInfo();
        System.out.println();
        book1.borrowBook();
        book1.borrowBook(); 
        System.out.println();
        book1.displayInfo();
    }
}