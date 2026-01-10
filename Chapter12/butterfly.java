package Chapter12;
import java.util.*;
public class butterfly{

    public static void butterflypattern(int num){

        for(int i=1;i<=num;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 2*(n-1)
            for (int j =1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            //
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }  
        

        for(int i=num;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 2*(n-1)
            for (int j=1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            //
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        butterflypattern(6);
    }
}


