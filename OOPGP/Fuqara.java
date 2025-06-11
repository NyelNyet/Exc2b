public class Fuqara extends Asnaf{    
    
    public Fuqara(String asnafname, String asnafID, String proof, double monthlySalary, double basicExpenses){
        super(asnafname, asnafID, proof, monthlySalary, basicExpenses);
    }

    @Override
    public void setAmountReceived() {
        super.amountReceived = basicExpenses-monthlySalary;
    }

    @Override
    public String toString() {
        return "Name: " + asnafname + " | ID: " + asnafID + " | Proof(s): " + proof + " | Amount Received: RM" + amountReceived;
    }
}