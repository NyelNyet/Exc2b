package Inheritance;

public class Librarian extends User {
    protected String staffID;

    public void addBook(){
        System.out.println(super.name+" added a new book");
    }

    @Override
    public void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("Staff ID: "+this.staffID);
    }
}
