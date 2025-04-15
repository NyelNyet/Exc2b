package Polymorphism;

public class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing A Rectangle.");
    }

    @Override
    public void name(){
        System.out.println("The Name Of This Shape Is Rectangle");
    }
}
