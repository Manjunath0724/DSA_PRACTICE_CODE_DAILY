package leetcode;

public class lt_50 {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        if (x == 0)
            return 0;
        if (x == -1 && n % 2 == 0)
            return 1.0;
        if (x == -1 && n % 2 != 0)
            return -1.0;
        long binform = n;
        if (binform < 0) {
            x = 1 / x;
            binform = -binform;
        }
        double ans = 1;
        while (binform > 0) {
            if (binform % 2 == 1) {
                ans *= x;
            }
            x *= x;
            binform /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_50 obj = new lt_50();
        double x = 2.0;
        int n = 10;
        double result = obj.myPow(x, n);
        System.out.println("Result: " + result);
    }
}

// class Solution {
// public double pow(double x, long n) {
// if (n==0) return 1;
// if (n<0) return pow(1/x, -n);
// if (n%2==0) return pow(x*x, n/2);
// return pow(x*x, (n-1)/2) * x;

// }

// public double myPow(double x, int n) {
// return pow(x, (long)n);
// }
// }

// 🧩 Explanation of Each Case
// - if (n == 0) return 1;
// - Any number raised to the power 0 is 1.
// - if (n < 0) return pow(1/x, -n);
// - Negative exponent rule:
// x^{-n}=\frac{1}{x^n}- Example: 2^{-3}=\frac{1}{2^3}=\frac{1}{8}.
// - if (n % 2 == 0) return pow(x*x, n/2);
// - If exponent is even, we can reduce the problem:
// x^n=(x^2)^{n/2}- Example: 2^{10}=(2^2)^5=4^5.
// - return pow(x*x, (n-1)/2) * x;
// - If exponent is odd, split it into one x and an even part:
// x^n=x\cdot (x^2)^{(n-1)/2}- Example: 2^5=2\cdot (2^2)^2=2\cdot 4^2=2\cdot
// 16=32.
