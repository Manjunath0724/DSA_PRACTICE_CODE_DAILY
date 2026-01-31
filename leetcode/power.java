package leetcode;

public class power {
    public static int power1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return n * power1(x,n - 1);
    }

    public static void main(String[] args) {
        System.out.print(power1(3, 5));
    }
}
