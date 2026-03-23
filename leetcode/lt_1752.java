package leetcode;

public class lt_1752 {

    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with next (circular using %)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // More than one drop means not rotated sorted
            if (count > 1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        lt_1752 sol = new lt_1752();
        int[] nums = { 3, 4, 5, 1, 2 };
        boolean result = sol.check(nums);
        System.out.println(result); // Output: true
    }
}
