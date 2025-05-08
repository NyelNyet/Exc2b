package Library;

import java.util.*;

public class Library {
    protected List<Book> books;
    protected List<User> users;

    //Constructor
    public Library(){
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void addUser(User user){
        this.users.add(user);
    }

    //find available book in library
    public List<Book> getAvailableBook(){
        List<Book> avaiableBooks = new ArrayList<>();
        this.books.forEach(x -> {
            if (x.isAvailable()) {
                avaiableBooks.add(x);
            }
        });
        return avaiableBooks;
    }

    //display available book
    public void displayAvailableBook(){
        System.out.println("\nAVAILABLE BOOK");
        getAvailableBook().forEach(x -> System.out.println(x));
    }

    //display user
    public void displayUser(){
        System.out.println("\nLIST OF LIBRARY USER");
        this.users.forEach(x -> System.out.println(x));
    }
}
