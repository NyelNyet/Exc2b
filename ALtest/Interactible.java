public class Interactible {
    private String interName;
    private String interID;
    private String status;

    public Interactible(String interName, String interID, String status){
        this.interName = interName;
        this.interID = interID;
        this.status = status;
    }

    public String getSpecs() {
        return "Name: " + interName + ", ID: " + interID + ", Status: " + status;
    }

}
