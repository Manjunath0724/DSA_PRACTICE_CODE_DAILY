package Chapter10_11;
import java.util.*;
public class funcover{
    public static int sum (int a,int b){
        return a+b;
    }
    public static int sum (int a,int b,int c){
        return a+b+c;
    }
     public static void main (String []args){
        Scanner sc = new Scanner(System.in); 
        System.out.println(sum(5,2));
        System.out.println(sum(4,2,1));
    }
}