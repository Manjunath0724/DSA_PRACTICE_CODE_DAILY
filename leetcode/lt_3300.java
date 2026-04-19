package leetcode;

public class lt_3300 {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int sum = 0;

            // calculate digit sum
            while (curr > 0) {
                int rem = curr % 10;
                sum = sum + rem;
                curr = curr / 10;
            }
            // update minimum digit sum
            min = Math.min(min, sum);
        }
        return min;
    }

    public static void main(String[] args) {
        lt_3300 s = new lt_3300();
        int[] nums = { 1, 10, 11, 12 };
        int result = s.minElement(nums);
        System.out.println(result);
    }
}
