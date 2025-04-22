package GPWORK;

public class Student extends User{
    public Student(String userName ,String userID ,String userEmail){
        super(userName,userID,userEmail);
    }

    @Override
    public void sendNotification(){
        System.out.println("Registering User: "+super.getName());

        System.out.println(super.getName()+" is registered!");
    }

    @Override
    public void borrowBook(){
        System.out.println("Student "+super.getName()+" is borrowing a book!");
    }

    @Override
    public void returnBook(){
        System.out.println("Student "+super.getName()+" is returning a book!");
    }
}
