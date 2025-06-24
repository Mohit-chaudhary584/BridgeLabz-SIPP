public class Book{
    String title;
    String author;
    double price;
    Book(){
        title="The Haunted";
        author="Shakespear";
        price=350.98;
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public static void main(String[] args) {
        Book book_1=new Book();
        Book book_2=new Book("Fifty","Stephen",342.3);
        book_1.display();
        book_2.display();
    }
    public void display(){
        System.out.println("title "+title+"\nauthor "+author+"\nprice "+price);
    }
}