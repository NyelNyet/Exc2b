package Exercises;

public class NestedLoop {
    public static void main(String[] args){
        int x = 0;
        for(int i=0;i<4;i++){
            x+=5;
            System.out.print("\n"+x);
            for(int j=0;j<4;j++){
                x += 5;
                System.out.print(" "+x);
            }   
        }
    }
}
