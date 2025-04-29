public class Interactable {
    private String interName;
    private String interID;

    public Interactable(String interName, String interID){
        this.interName = interName;
        this.interID = interID;
    }

    public String getSpecs() {
        return "Name: " + interName + ", ID: " + interID;
    }

}
