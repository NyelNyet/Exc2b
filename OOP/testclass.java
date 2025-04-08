public class testclass {
    public static void main(String[] args) {
        BankAccount p01 = new BankAccount("Ali","Ali123");

        System.out.println(p01.getOwnerName());

        try{
            p01.withdraw(1000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());   
        }
        
    }
}
