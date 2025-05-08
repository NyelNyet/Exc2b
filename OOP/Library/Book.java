package Library;

public class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    //Constructor
    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    
    public String getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
