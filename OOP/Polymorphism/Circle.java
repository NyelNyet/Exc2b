package Polymorphism;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing A Circle.");
    }

    @Override
    public void name(){
        System.out.println("The Name Of This Shape Is Circle");
    }
}
