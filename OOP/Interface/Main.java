package Interface;

public class Main {
    public static void main(String[] args) {
        Drawable c = new Circle(3.14);
        Drawable r = new Rectangle(5.5, 2.5);

        c.draw();
        c.displayInfo();
        System.out.println();
        r.draw();
        r.displayInfo();
    }
    
}
