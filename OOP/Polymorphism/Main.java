package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape r = new Rectangle();

        c.draw();
        t.draw();
        r.draw();
    }
    
}
