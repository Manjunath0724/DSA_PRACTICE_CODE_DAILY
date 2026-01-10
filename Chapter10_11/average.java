package Chapter10_11;
import java.util.*;


public class average{

    public static void average(int a,int b,int c){
        int average=(a+b+c)/3;
        System.out.println("Average of three numbers is :"+average);
    }

    public static void isEven(int a){
        if(a%2==0){
            System.out.println("Even number!");
        }
        else{
            System.out.println("Odd number!");
        }
    }
    public static void main(String []args){
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter three numbers:");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        // average(a,b,c);

        isEven(6);

    }
}