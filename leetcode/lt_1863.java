package leetcode;

public class lt_1863 {
    public int subsetXORSum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total |= num; // Step 1: Compute bitwise OR of all numbers
        }
        return total * (1 << (nums.length - 1)); // Step 2: Multiply by 2^(n-1)
    }

    public static void main(String[] args) {
        lt_1863 s = new lt_1863();
        int[] nums = { 1, 3 };
        int result = s.subsetXORSum(nums);
        System.out.println(result); // Output: 6
    }
}
