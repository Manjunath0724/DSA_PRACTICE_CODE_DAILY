package Chapter12;
import java.util.*;
public class palindrome_num{

    public static void palindrome_pyramid(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){//initalize j to i  and then the j willl check if greater then the 1 or wual to and then print and mean-while decereses it
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void main (String []args){
        palindrome_pyramid(5);
    }
}


