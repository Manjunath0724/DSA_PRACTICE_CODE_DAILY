package leetcode;

public class tilingproblem {
    public static int tile(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f1 = tile(n - 1);
        int f2 = tile(n - 2);
        int total = f1 + f2;
        return total;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tile(n));
    }
}
