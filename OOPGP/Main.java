public class Main {
    public static void main(String[] args) {
        IM d1 = new IM("Door1","D1","Closed");
        IM d2 = new IM("Door2","D2","Open");
        IM d3 = new IM("Door3","D3","Closed");

        System.out.println(d1.getInteractableList());
        d1.getDetail();

        System.out.println();

        IM.getAllDetail();
    }
}
