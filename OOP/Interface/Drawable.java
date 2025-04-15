package Interface;

public interface Drawable {
    void draw();

    default void displayInfo(){
        System.out.println("This Is A Drawable Object");
    }
}
