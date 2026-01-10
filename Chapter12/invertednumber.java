package Chapter12;
import java.util.*;
public class invertednumber{

    public static void invertedpyramid(int num){

        for (int i =1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){//to print till 1 to ___
                    System.out.print(j+" ");//print number
                }
            System.out.println();
        }
    }
    public static void main (String []args){
        invertedpyramid(5);
    }
}


