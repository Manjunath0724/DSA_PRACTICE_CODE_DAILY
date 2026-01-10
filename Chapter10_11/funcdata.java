package Chapter10_11;
import java.util.*;

public class funcdata {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b; // Remove the extra '+' character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(sum(5, 2));      // Calls int sum method
        System.out.println(sum(4.1f, 2.1f)); // Calls float sum method
    }
}
