package leetcode;

public class lt_1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] numbers = new int[201];
        int sum = 0;
        int maxAbs = 0;
        for (int n : nums) {
            maxAbs = Math.max(maxAbs, Math.abs(n));
            numbers[100 + n]++;
            sum += n;
        }
        if (maxAbs == 0) {
            return 0;
        }
        while (k-- != 0) {
            int i = 100 - maxAbs;
            while (numbers[i] == 0) {
                i++;
            }
            numbers[i]--;
            numbers[200 - i]++;
            sum -= 2 * (i - 100);
        }
        return sum;
    }

    public static void main(String[] args) {
        lt_1005 lt = new lt_1005();
        System.out.println(lt.largestSumAfterKNegations(new int[] { 4, 2, 3 }, 1));
        System.out.println(lt.largestSumAfterKNegations(new int[] { 3, -1, 0, 2 }, 3));
        System.out.println(lt.largestSumAfterKNegations(new int[] { 2, -3, -1, 5, -4 }, 2));
    }
}
