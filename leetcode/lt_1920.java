package leetcode;

public class lt_1920 {
    class Solution {
        public int[] buildArray(int[] nums) {
            int n = nums.length;

            // Step 1: Encode both old and new values into nums[i]
            for (int i = 0; i < n; i++) {
                nums[i] = nums[i] + n * (nums[nums[i]] % n);
            }

            // Step 2: Extract the new values
            for (int i = 0; i < n; i++) {
                nums[i] /= n;
            }

            return nums;
        }
    }

    public static void main(String[] args) {
        lt_1920 s = new lt_1920();
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] result = s.new Solution().buildArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
