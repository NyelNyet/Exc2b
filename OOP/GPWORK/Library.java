package GPWORK;

public class Library{

    public void addBook(Book book){
        System.out.println("A new book, "+book.getBookName()+" is added into the library!");
    }
    
    public void register(User user){} 
     
}

/*

public void registerWithAnimation(User user){
        for(int i = 0;i<2;i++){
            System.out.println("Registering User: "+user.getName()+".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\033[H\033[2J");
            System.out.flush();

            System.out.println("Registering User: "+user.getName()+"..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\033[H\033[2J");
            System.out.flush();
            
            System.out.println("Registering User: "+user.getName()+"...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }

 */
