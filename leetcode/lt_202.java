package leetcode;

public class lt_202 {
    private int fun(int n) {
        int sum = 0;
      
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum = sum + digit * digit;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        while (fast != 1) {
            slow = fun(slow);
            fast = fun(fun(fast));
            
            if (slow == fast && slow != 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        lt_202 sol = new lt_202();
        int n = 19;
        boolean result = sol.isHappy(n);
        System.out.println(n + " is a happy number: " + result);
    }
}
