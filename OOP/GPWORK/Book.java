package GPWORK;

public class Book{
    private String bookName;
    private String bookID;

    public Book(String bookName,String bookID){
        this.bookName = bookName;
        this.bookID = bookID;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }
}
