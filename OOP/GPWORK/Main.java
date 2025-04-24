package GPWORK;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        User u1 = new Student("Ali","STU001","AliST001@gmail.com");
        User t1 = new Teacher("Marina", "TEA001", "MarinaTEA001@gmail.com");
        Book b1 = new Book("Calculus 1","BOO001");

        lib.register(u1);

        if(u1 instanceof User){
            u1.sendNotification();
            System.out.println("Name: "+u1.getName());
            System.out.println("User ID: "+u1.getUserID());
            System.out.println("Email: "+u1.getUserEmail());
            u1.borrowBook(b1);
            u1.returnBook(b1);
        }

        System.out.println();
        lib.register(t1);

        if(t1 instanceof User){
            t1.sendNotification();
            System.out.println("Name: "+t1.getName());
            System.out.println("User ID: "+t1.getUserID());
            System.out.println("Email: "+t1.getUserEmail());
            t1.borrowBook(b1);
            t1.returnBook(b1);
        }

        System.out.println();
        lib.addBook(b1);
    }
}
