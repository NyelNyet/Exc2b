import java.io.*;

public class Quiz3 {
    public static void main(String[] args) throws IOException{
        double[][] X ={
            {11.92,10.94,8.82,14.72,11.76,7.85,13.99},
            {10.93,6.84,7.81,10.72,8.96,3.95,11.91},
            {9.93,6.91,9.9,3.76,6.72,9.81,6.97},
            {7.82,5.93,10.98,1.72,10.86,3.81,8.84},
            {9.76,8.74,0.81,0.92,9.96,1.85,5.88}
        };

        double[] total = new double[7];

        double[] average = calcTotal(X,total);

        printAvg(X, total, average);
    }

    public static double[] calcTotal(double[][] X, double[] total){
        double[] avg = new double[7];

        for(int i = 0;i<X.length;i++){
            for(int j = 0;j<X[i].length;j++){
                total[i] += X[i][j];
            }
            avg[i] = total[i]/7;
        }

        return avg;
    }

    public static void printAvg(double[][] X,double[] total,double[] average) throws IOException{

        File f = new File("snowfall.txt");

        if(f.exists()){
            System.out.println("File already exists. Please use another name.");
            System.exit(1);
        }
        
        PrintWriter out = new PrintWriter(f);
        out.println("\t\t Su\t\t M\t\t T\t\t W\t\t Th\t\t F\t\t Sa\t\tTotal\tAverage");
        for(int i = 0;i<X.length;i++){
            
            out.print("Week "+(i+1)+" ");
            for(int j = 0;j<X[i].length;j++){
                out.print("\t "+X[i][j]);
            }
            out.printf("\t%.2f\t%.3f",total[i],average[i]);
            out.println();
        }
        out.close();

        System.out.println("\tSu\tM\tT\tW\tTh\tF\tSa\tTotal\tAverage");
        for(int i = 0;i<X.length;i++){
            System.out.print("Week "+(i+1)+" ");
            for(int j = 0;j<X[i].length;j++){
                System.out.print("\t"+X[i][j]);
            }
            System.out.printf("\t%.2f\t%.3f",total[i],average[i]);
            System.out.println();
        }
    }
}