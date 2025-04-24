package AL;
import java.util.*;

public class Tryarraylist {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        arrayOne(name);

        ArrayList<List<Object>> stuff = new ArrayList<>();

        arrayTwo(stuff);
        
    }

    public static void print(List<String> name){
        //recommended to use List instead of ArrayList as parameter for flexibility
        name.forEach(x -> System.out.println(x));
    }

    public static void printTwo(List<List<Object>> stuff){
        stuff.forEach(x -> System.out.println(x));
    }

    public static void arrayOne(List<String> name){
        name.add("Ali");
        name.add("Abu");
        name.add("Ah Chong");

        print(name);
        System.out.println();
        /*
        Ali
        Abu
        Ah Chong
         */

        name.remove(0);
        name.add("Ali");
        print(name);
        System.out.println();
        /*
        Abu
        Ah Chong
        Ali
         */

        name.remove(0);
        name.addFirst("Ali");
        print(name);
        System.out.println();
        /*
        Ali
        Abu
        Ah Chong
         */
    }

    public static void arrayTwo(List<List<Object>> stuff){
        //Object is a superclass of datatype(String,int,double,boolean,custome objects,etc...)
        stuff.add(Arrays.asList("Name","Age","Education"));
        stuff.add(Arrays.asList("Ali","20","Bachelor of Comp Sci"));
        printTwo(stuff);
    }
}
