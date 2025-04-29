package AL;

import java.util.*;
import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {
        ArrayList<Record> data = new ArrayList<Record>();

        data.add(new Record("Ali", 20));
        data.add(new Record("Abu", 25));

        data.forEach(x -> System.out.println("Name: "+x.getName()+"\tAge:"+x.getAge()));


        
        javaFXPair();// ArrayList<Pair<datatype, datatype>> || Pair<datatype, Pair<datatype, datatype>>
    }

    public static void javaFXPair(){
        ArrayList<Pair<String, Integer>> datas = new ArrayList<>();

        datas.add(new Pair<String,Integer>("Ali", 20));
        datas.add(new Pair<String,Integer>("Abu", 25));

        System.out.println();

        datas.forEach(x -> System.out.println(x.getKey()+" "+x.getValue()));

        System.out.println();

        //

        Pair<String, Pair<String, Integer>> pairData = new Pair<>("Row 1: ", new Pair<>("Ali", 20));

        System.out.println(pairData.getKey()+" "+pairData.getValue().getKey()+" "+pairData.getValue().getValue());
    }
}
