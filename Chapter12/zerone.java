package Chapter12;
import java.util.*;
public class zerone{

    public static void zeronepyramid(int num){

        for (int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){//to print till 1 to ___
                    if((i+j)%2==0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" 0 ");
                    }
                }
            System.out.println();
        }
    }
    public static void main (String []args){
        zeronepyramid(5);
    }
}


