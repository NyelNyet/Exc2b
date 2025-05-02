import java.util.ArrayList;

public class IM {
    private static ArrayList<Interactible> interactableList = new ArrayList<>();

    public IM(String interName,String interID,String status){
        interactableList.add(new Interactible(interName, interID, status));
    }

    public ArrayList<Interactible> getInteractableList() {
        return interactableList;
    }

    public void getDetail(){
        System.out.println(interactableList.get(0).getSpecs());
    }

    public static void getAllDetail(){
        for(Interactible i : interactableList){
            System.out.println(i.getSpecs());
        }
    }
}
