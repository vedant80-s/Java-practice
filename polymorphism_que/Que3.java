package polymorphism_que;

class Book{
    String bookName ;
    String authorName; 
    int bookPages ;
    public Book(int bookPages) {
        this.bookPages = bookPages;
    }
    public Book(int bookPages , String bookName) {
        this.bookPages = bookPages;
        this.bookName = bookName ;
    }
    public Book(String authorName , int bookPages) {
        this.bookPages = bookPages;
        this.authorName = authorName ;
    }
    public Book(String bookName , String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }
    @Override
    public String toString() {
        return "Book [bookName= " + bookName + ", authorName= " + authorName + ", bookPages= " + bookPages + "]";
    }
}
public class Que3 {
    public static void main(String[] args) {
        Book b = new Book(34) ;
        Book b1 = new Book(340000 , "Ramayan") ;
        Book b2 = new Book("Tulsidas ji" , 34) ;
        Book b3 = new Book("Ramayan" , "Tulsidas ji") ;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}