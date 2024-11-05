import java.util.ArrayList;
class Book{
    private int bookId;
    private String bookName;
    private String authorName;
    public Book(int bookId, String bookName, String authorName){
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public String toString(){
        return "Book [bookId= "+bookId+", bookName= "+bookName+", authorName= "+authorName+"]";
    }
}
public class Lab5a{
    public static void main(String[] args){
        ArrayList<Book> books=new ArrayList<Book>();
        books.add(new Book(101,"Let Us C","Yashavant P Kanetkar"));
        books.add(new Book(102,"Head First Java","Kathy Sierra"));

        System.out.println("--All Books--");
        for(Book b:books){
            System.out.println(b);
        }
    }
}