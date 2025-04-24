package GPWORK;

public class Teacher extends User{
    public Teacher(String userName ,String userID ,String userEmail){
        super(userName,userID,userEmail);
    }

    @Override
    public void sendNotification(){
        System.out.println("Registering User: "+super.getName());

        System.out.println(super.getName()+" is registered!");
    }

    @Override
    public void borrowBook(Book book){
        System.out.println("Teacher "+super.getName()+" is borrowing a book, "+book.getBookName()+"!");
    }

    @Override
    public void returnBook(Book book){
        System.out.println("Teacher "+super.getName()+" is returning a book, "+book.getBookName()+"!");
    }
}
