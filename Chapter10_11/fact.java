package Chapter10_11;
import java.util.*;
public class fact{
    public static int facto(int a){
        int fact=1;
        if(a==1 || a==0){
            return 1;
        }else{

        for (int i=2;i<=a;i++){

        fact*=i;
        }
        return fact;
        }
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial:");
        int a= sc.nextInt();
        int fact=facto(a);
        System.out.println(fact);
    
    }
}