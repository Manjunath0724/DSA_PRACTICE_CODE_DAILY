package leetcode;

public class lt_1413 {

    public int minStartValue(int[] nums) {
        int prefix = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            min = Math.min(prefix, min);
        }

        if (min > 0) {
            return 1;
        }

        return Math.abs(min) + 1;
    }

    public static void main(String[] args) {
        lt_1413 lt = new lt_1413();
        int[] nums = { -3, 2, -3, 4, 2 };
        System.out.println(lt.minStartValue(nums));
    }
}
