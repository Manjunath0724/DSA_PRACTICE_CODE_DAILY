package Chapter10_11;
import java.util.*;

public class prime {
    public static boolean prime1(int a) {
        // boolean isPrime=true;
        if(a<=1){
            System.out.println("Number is not composite nor prime !");
            return false;
        }else{

        for (int i=2;i<=a-1;i++){
            if(a%2==0){
                return false;
            }
        }
        return true;
        }
    }

    public static boolean prime2(int n) {
        // boolean isPrime=true;
        if(n<=1){
            System.out.println("Number is not composite nor prime !");
            return false;
        }else{

        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(prime1(1));      // Calls int sum method
                System.out.println(prime2(5));      // Calls int sum method

    }
}
