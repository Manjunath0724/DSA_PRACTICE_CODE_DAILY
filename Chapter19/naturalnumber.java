package Chapter19;

public class naturalnumber {
    public static void main(String[] args) {
        System.out.print("The sum of n natural numbers is :" + cal(5));
    }

    public static int cal(int n) {
        if (n == 1) {
            return 1;
        }
        return n + cal(n - 1);
    }
}
