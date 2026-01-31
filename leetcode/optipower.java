package leetcode;

public class optipower {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(power(a, n));
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        // int opti=power(a,n/2)*power(a,n/2);//still this line has time complexity of
        // O(n)

        // optimized approach for o(log N)
        int half = power(a, n / 2);
        int opti = half * half;
        if (n % 2 != 0) {
            opti = opti * a;
        }
        return opti;
    }
}
