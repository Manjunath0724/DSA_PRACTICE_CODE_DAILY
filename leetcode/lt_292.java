package leetcode;

public class lt_292 {
    public boolean canWinNim(int n) {
        if (n % 4 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        lt_292 lt = new lt_292();
        int n = 5;
        System.out.println(lt.canWinNim(n)); // Output: false
    }
}
