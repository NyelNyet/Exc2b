import java.util.ArrayList;

public class AsnafManager {
    private static ArrayList<Asnaf> asnafList = new ArrayList<>();

    public AsnafManager(String asnafName,String asnafID){
        asnafList.add(new Asnaf(asnafName,asnafID));
    }

    public static ArrayList<Asnaf> getAsnafList() {
        return asnafList;
    }

    public static void getAllAsnafDetail(){
        for(Asnaf al : asnafList){
            System.out.println(al.getDetail());
        }
    }

    public void getDetail(){
        System.out.println();
    }
}
