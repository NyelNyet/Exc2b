public class Main {
    public static void main(String[] args) {
        AsnafManager a1 = new AsnafManager("Ali", "Ali1");
        AsnafManager a2 = new AsnafManager("Abu", "Abu1");

        System.out.println(AsnafManager.getAsnafList());
        a2.getDetail();

        AsnafManager.getAllAsnafDetail();

    }
}   
