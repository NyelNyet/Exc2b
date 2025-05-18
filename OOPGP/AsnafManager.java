import java.util.ArrayList;

public class AsnafManager {
    private static ArrayList<Asnaf> asnafList;

    public AsnafManager(){
        asnafList = new ArrayList<>();
    }

    public void addAsnaf(Asnaf asnaf){
        asnafList.add(asnaf);
    }

    public ArrayList<Asnaf> getAsnafList() {
        return asnafList;
    }

    public void getAllAsnafDetail(){
        asnafList.forEach(x -> System.out.println(x.toString()));
    }
}
