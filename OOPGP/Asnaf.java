public abstract class Asnaf{
    protected String asnafname;
    protected String asnafID;
    protected String proof;
    protected double amountReceived;
    protected double monthlySalary;
    protected double basicExpenses;

    public Asnaf(String asnafname, String asnafID, String proof, double monthlySalary, double basicExpenses){
        this.asnafname = asnafname;
        this.asnafID = asnafID;
        this.proof = proof;
        this.monthlySalary = monthlySalary;
        this.basicExpenses = basicExpenses;
    }

    @Override
    public abstract String toString();
    
    public abstract void setAmountReceived();
}

/*
        LocalDate currentdate = LocalDate.now();
        LocalDate passDate = LocalDate.of(2025, 2, 25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        passDate.format(formatter);
        long daysBetween = ChronoUnit.DAYS.between(passDate, currentdate);

        System.out.println(daysBetween);
*/