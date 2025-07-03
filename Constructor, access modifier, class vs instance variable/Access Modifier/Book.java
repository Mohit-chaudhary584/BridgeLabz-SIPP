class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("Author (private accessed via getter): " + getAuthor());
    }

    public static void main(String[] args) {
        Book book1 = new Book("978-93-5260-778-7", "Java Programming", "Mohit Sharma");
        book1.displayBookDetails();

        System.out.println("\nUpdating author...");
        book1.setAuthor("Aanya Verma");
        System.out.println("Updated Author: " + book1.getAuthor());
    }
}