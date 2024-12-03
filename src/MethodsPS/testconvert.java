package MethodsPS;

public class testconvert {
    public static void main(String[] args){
        System.out.println("Feet\t\tMeters\t\t|\tMeters\t\tFeet");
        for(int i = 1;i<=10;i++){
            System.out.println(i+"\t\t" + convert.footToMeter(i)+"\t\t"+"|"+"\t"+(15+5*i)+"\t\t"+convert.meterToFoot(15+5*i));
        }
    }
}
