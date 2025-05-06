public class Asnaf {
    private String asnafname;
    private String asnafID;

    public Asnaf(String asnafname, String asnafID){
        this.asnafname = asnafname;
        this.asnafID = asnafID;
    }

    public String getDetail(){
        return "Name: " + this.asnafname + " ID: " + this.asnafID;
    }
    
}
