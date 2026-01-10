package Chapter12;
import java.util.*;
public class rhombus{

    public static void rhombuspattern(int num){

        for(int i=1;i<=num;i++){
            for(int j=1;j<=(num-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        rhombuspattern(15);
    }
}


 