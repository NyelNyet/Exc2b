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
    public void borrowBook(){
        System.out.println("Teacher "+super.getName()+" is borrowing a book!");
    }

    @Override
    public void returnBook(){
        System.out.println("Teacher "+super.getName()+" is returning a book!");
    }
}
