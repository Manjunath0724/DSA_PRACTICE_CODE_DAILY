package leetcode;

public class lt_1550 {

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3)
            return false;
        for (int i = 0; i <= arr.length - 3; i++) {
            if ((arr[i] & 1) == 1 && (arr[i + 1] & 1) == 1 && (arr[i + 2] & 1) == 1)
                return true;
        }
        return false;
    }

public static void main(String[] args) {
    lt_1550 s = new lt_1550();
    int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
    boolean result = s.threeConsecutiveOdds(arr);
    System.out.println(result);
}
