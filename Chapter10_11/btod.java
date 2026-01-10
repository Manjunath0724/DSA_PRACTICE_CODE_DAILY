package Chapter10_11;
import java.util.*;

public class btod {
    public static void bintodec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec += lastDigit * Math.pow(2, pow);
            pow++;
            binNum /= 10; // ✅ Corrected this line it is used here to remove the last digit strip off.
        }

        System.out.println("Decimal of: " + myNum + " = " + dec);
    }
public static void dectobin(int n) {
        int myNum = n; 
        int pow = 0;
        int bin = 0;

        while (n > 0) {
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2; // ✅ Corrected this line
        }

        System.out.println("Decimal of: " + myNum + " = " + bin);
    }

    public static void main(String[] args) {
        bintodec(101); // Output should be: Decimal of: 101 = 5
        dectobin(71);
    }
}