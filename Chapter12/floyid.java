package Chapter12;
import java.util.*;
public class floyid{

    public static void floyidpyramid(int num){
        int counter=1;
        for (int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){//to print till 1 to ___
                    System.out.print(counter+" ");//print number
                    counter++;
                }
            System.out.println();
        }
    }
    public static void main (String []args){
        floyidpyramid(5);
    }
}


