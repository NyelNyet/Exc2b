package Interface;

public class Circle implements Drawable{
    private double rad;

    public Circle(double rad){
        this.rad = rad;
    }

    @Override
    public void draw(){
        System.out.println("Drawing A Circle Radius Of "+rad+".");
    }
}
