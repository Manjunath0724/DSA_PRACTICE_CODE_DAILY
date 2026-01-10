package Chapter10_11;
import java.util.*;

public class primeinrange {

    public static boolean prime1(int a) {
        if (a <= 1) {
            System.out.println(a + " is not composite nor prime!");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n) {
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (prime1(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Final newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primeinrange(20); // You can replace 20 with sc.nextInt() for dynamic input
    }
}