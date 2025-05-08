package Library;

import java.util.*;

public abstract class User {
    private String userID;
    private String name;
    private NotificationService notifyService;
    private List<Book> borrowedBooks; 
    
    //Contsructor
    public User(String userID, String name, NotificationService notify){
        this.userID = userID;
        this.name = name;
        this.notifyService = notify;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserID() {
        return userID;
    }
    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    protected NotificationService getNotificationService(){
        return notifyService;
    }

    protected void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }

    //abstract
    public abstract boolean borrowBook(Book book);

    public boolean returnBook(Book book) {
        if(borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.setAvailable(true);
        }

        notifyService.sendNotification("Returned Book "+book.title);
        return true;
    }
}
