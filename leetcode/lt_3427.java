package leetcode;

public class lt_3427 {

    public int subarraySum(int[] nums) {
        int n = nums.length;

        // Build prefix sum array
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            // Sum from start to i = prefix[i+1] - prefix[start]
            sum += prefix[i + 1] - prefix[start];
        }

        return sum;
    }

    public static void main(String[] args) {
        lt_3427 s = new lt_3427();
        int[] nums = { 1, 2, 3 };
        int result = s.subarraySum(nums);
        System.out.println(result); // Output: 10
    }
}
