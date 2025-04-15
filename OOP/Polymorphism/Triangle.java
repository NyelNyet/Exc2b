package Polymorphism;

public class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing A Triangle.");
    }

    @Override
    public void name(){
        System.out.println("The Name Of This Shape Is Triangle");
    }
}
