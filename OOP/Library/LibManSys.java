package Library;

public class LibManSys{
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("001", "Meow", "AliAbu"));
        lib.addBook(new Book("002", "MeowMeow", "AbuAli"));

        lib.displayAvailableBook();
        lib.displayUser();
    }
}
