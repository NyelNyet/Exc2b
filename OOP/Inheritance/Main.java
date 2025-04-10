package Inheritance;

public class Main {
    public static void main(String[] args) {
        Student u1 = new Student();
        Librarian s1 = new Librarian();

        u1.name = "Ali";
        u1.email = "Ali123@libstudent.com";
        u1.studID = "Stud001";

        s1.name = "Abu";
        s1.email = "Abu123@libstaff.com";
        s1.staffID = "Staff001";

        System.out.println("DISPLAY STUDENT INFORMATION");
        u1.borrowBook();
        u1.displayUserInfo();
        System.out.println();

        System.err.println("DISPLAY LIBRARIAN INFORMATION");
        s1.addBook();
        s1.displayUserInfo();

    }
}
