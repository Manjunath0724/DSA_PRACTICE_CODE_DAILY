package leetcode;

public class lt_1464 {
    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }
        return (first - 1) * (second - 1);
    }

    public static void main(String[] args) {
        lt_1464 sol = new lt_1464();
        int[] nums = { 3, 4, 5, 2 };
        System.out.println(sol.maxProduct(nums)); // Output: 12
    }
}
