import java.util.ArrayList;

public class IM {
    private static ArrayList<Interactable> interactableList = new ArrayList<>();

    public IM(String interName,String interID,String status){
        interactableList.add(new Interactable(interName, interID));
    }

    public ArrayList<Interactable> getInteractableList() {
        return interactableList;
    }

    public void getDetail(){
        System.out.println(interactableList.get(0).getSpecs());
    }

    public static void getAllDetail(){
        for(Interactable i : interactableList){
            System.out.println(i.getSpecs());
        }
    }
}
