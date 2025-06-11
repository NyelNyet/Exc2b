import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AsnafManagementSystem {
    public static void main(String[] args) {
        AsnafManager am = new AsnafManager();
        Fuqara f1 = new Fuqara ("Ali", "001", "Eviction Notice",1000,2500); 
        Masakin m1 = new Masakin("Abu", "002", "Insufficient Supply", 2000, 2500);

        am.addAsnaf(f1);
        am.addAsnaf(m1);

        f1.setAmountReceived();
        m1.setAmountReceived();

        am.getAllAsnafDetail();

        
    }
}   
