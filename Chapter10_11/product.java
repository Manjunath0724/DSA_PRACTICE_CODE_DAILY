package Chapter10_11;
import java.util.*;
public class product{
    public static int product(int a,int b){
        int pro=a*b;
        // System.out.println(pro);
        return pro;
       
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int a=5;
        int b=10;
        int pro=product(a,b);
        System.out.println(pro);
        
    }
}