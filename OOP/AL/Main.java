package AL;

import java.util.*;
import javafx.Pair;

public class Main {
    public static void main(String[] args) {
        ArrayList<Record> data = new ArrayList<Record>();

        data.add(new Record("Ali", 20));
        data.add(new Record("Abu", 25));

        data.forEach(x -> System.out.println("Name: "+x.getName()+"\tAge:"+x.getAge()));

        //OR

        ArrayList<Pair<String, Integer>> datas = new ArrayList<>();

        

    }
}
