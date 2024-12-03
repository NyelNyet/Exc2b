package MethodsPS;

public class Commission {
    public static void main(String[] args){
        System.out.println("Sales Amount\tCommission");
        for(int i = 1;i<20;i++){
            System.out.println((i+1)*5000 + "\t\t" + computeCommission((i+1)*5000));
        }
    }

    public static double computeCommission(double salesAmount){
        double commission = 0;
        if(salesAmount<=5000 && salesAmount>=0.01){
            commission = salesAmount*0.08;
        }else if(salesAmount>5000 && salesAmount<=10000){
            commission = 5000*0.08 + (salesAmount-5000)*0.10;
        }else if(salesAmount>10000){
            commission = 5000*0.08 + 5000*0.10 + (salesAmount-10000)*0.12;
        }
        return commission;
    }
}