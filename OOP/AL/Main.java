package AL;

import java.util.*;
import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {
        ArrayList<Record> data = new ArrayList<Record>();

        data.add(new Record("Ali", 20));
        data.add(new Record("Abu", 25));

        data.forEach(x -> System.out.println("Name: "+x.getName()+"\tAge:"+x.getAge()));

        //OR

        ArrayList<Pair<String, Integer>> datas = new ArrayList<>();

        datas.add(new Pair<String,Integer>("Ali", 20));
        datas.add(new Pair<String,Integer>("Abu", 25));

        datas.forEach(x -> System.out.println(x));


    }
}
