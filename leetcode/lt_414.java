package leetcode;

public class lt_414 {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int n : nums) {

            if (n == first || n == second || n == third) {
                continue;
            }

            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;

    }

    public static void main(String[] args) {
        lt_414 sol = new lt_414();
        int[] nums = { 3, 2, 1 };
        System.out.println(sol.thirdMax(nums)); // Output: 1
    }
}
