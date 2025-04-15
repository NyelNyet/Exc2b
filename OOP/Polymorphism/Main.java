package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape r = new Rectangle();        

        if(c instanceof Shape){
            System.out.println("c is an instance of Shape");
        }
        if(t instanceof Shape){
            System.out.println("t is an instance of Shape");
        }
        if(r instanceof Shape){
            System.out.println("r is an instance of Shape");
        }
        System.out.println();
        
        System.out.println("Singular Implementation");
        c.draw();
        t.draw();
        r.draw();
        System.out.println();

        Shape[] shapes = {new Circle(),new Triangle(),new Rectangle()};
        System.out.println("Array Implementation.");
        for(Shape s : shapes){
            s.draw();
        }
        System.out.println();

        System.out.println("Method Implementation");
        for(Shape s : shapes){
            drawShape(s);
        }
    }

    public static void drawShape(Shape s){
        s.draw();
    }
    
}
