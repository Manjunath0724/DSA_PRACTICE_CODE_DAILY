package leetcode;

public class lt_1979 {

    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        // Find min and max
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        // Compute GCD using Euclidean algorithm
        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        lt_1979 sol = new lt_1979();
        int[] nums = { 2, 5, 6, 9, 10 };
        int result = sol.findGCD(nums);
        System.out.println(result); // Output: 2
    }

}
