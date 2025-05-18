public class Asnaf{
    private String asnafname;
    private String asnafID;
    private String proof;

    public Asnaf(String asnafname, String asnafID, String proof){
        this.asnafname = asnafname;
        this.asnafID = asnafID;
        this.proof = proof;
    }

    @Override
    public String toString(){
        return "Name: " + this.asnafname + " | ID: " + this.asnafID + " | Proof(s): " + this.proof;
    }
    
}
