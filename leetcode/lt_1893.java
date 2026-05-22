package leetcode;

public class lt_1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {

        int[] diff = new int[52];

        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            diff[start] += 1;
            diff[end + 1] -= 1;
        }
        int covered = 0;
        for (int i = 1; i <= 50; i++) {
            covered += diff[i];
            if (i >= left && i <= right && covered == 0) {
                return false;
            }
        }

        return true;
    }

public static void main(String[] args) {
    lt_1893 s = new lt_1893();
    int[][] ranges = { {1, 2}, {3, 4}, {5, 6} };
    int left = 2;
    int right = 5;
    boolean result = s.isCovered(ranges, left, right);
    System.out.println(result);
}
