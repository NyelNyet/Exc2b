package Inheritance;

public class Student extends User{
    protected String studID;

    public void borrowBook(){
        System.out.println(super.name+" borrowed a book");
    }

    @Override
    public void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("Student ID: "+this.studID);
    }
}
