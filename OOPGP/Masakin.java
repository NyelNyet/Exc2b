public class Masakin extends Asnaf{

    public Masakin(String asnafname, String asnafID, String proof, double monthlySalary, double basicExpenses){
        super(asnafname, asnafID, proof, monthlySalary, basicExpenses);
    }

    @Override
    public String toString() {
        return "Name: " + asnafname + " | ID: " + asnafID + " | Proof(s): " + proof + " | Amount Received: RM" + amountReceived;
    }

    @Override
    public void setAmountReceived() {
        super.amountReceived = basicExpenses-monthlySalary;
    }

}
