package leetcode;

public class lt_2535 {
    public int differenceOfSum(int[] nums) {
        int elesum = 0;
        int digsum = 0;

        for (int i = 0; i < nums.length; i++) {
            elesum += nums[i];
            int num = nums[i];
            while (num > 0) {
                digsum += num % 10;
                num = num / 10;

            }
        }
        return Math.abs(elesum - digsum);
    }

    public static void main(String[] args) {
        lt_2535 s = new lt_2535();
        int[] nums = { 1, 15, 6, 3 };
        System.out.println(s.differenceOfSum(nums));
    }
}
