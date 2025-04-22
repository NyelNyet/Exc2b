package GPWORK;

public abstract class User implements Notification{
    private String userName;
    private String userID;
    private String userEmail;

    public User(String userName ,String userID ,String userEmail){
        this.userName = userName;
        this.userID = userID;
        this.userEmail = userEmail;
    }

    public String getName(){
        return this.userName;
    }

    public String getUserID(){
        return this.userID;
    }

    public String getUserEmail(){
        return this.userEmail;
    }

    public void borrowBook(){}

    public void returnBook(){}
}   
