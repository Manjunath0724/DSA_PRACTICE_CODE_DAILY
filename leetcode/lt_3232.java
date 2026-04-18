package leetcode;

public class lt_3232 {

    public boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                sum1 += nums[i];
            } else {
                sum2 += nums[i];
            }
        }

        return sum1 != sum2;
    }

    public static void main(String[] args) {
        lt_3232 s = new lt_3232();
        int[] nums = { 1, 10, 11, 12 };
        boolean result = s.canAliceWin(nums);
        System.out.println(result);
    }
}
