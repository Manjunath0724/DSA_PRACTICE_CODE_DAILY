package leetcode;

public class lt_1991 {

    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i; // leftmost valid index
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        lt_1991 sol = new lt_1991();
        int[] nums = { 2, 3, -1, 8, 4 };
        int result = sol.findMiddleIndex(nums);
        System.out.println(result); // Output: 3
    }
}
