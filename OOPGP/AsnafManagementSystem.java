import java.util.Date;

public class AsnafManagementSystem {
    public static void main(String[] args) {
        AsnafManager am = new AsnafManager();

        am.addAsnaf(new Asnaf("Ali", "001", "Eviction Notice"));

        am.getAllAsnafDetail();

        Date date = new Date();

        System.out.println(date);
    }
}   
