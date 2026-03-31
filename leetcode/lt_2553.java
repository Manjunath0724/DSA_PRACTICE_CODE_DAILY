package leetcode;

public class lt_2553 {

    public int[] separateDigits(int[] nums) {

        int len = 0;
        for (int num : nums) {

            while (num > 0) {
                len++;
                num = num / 10;
            }
        }

        int[] res = new int[len];
        for (int i = nums.length - 1; i > -1; i--) {

            int num = nums[i];
            while (num > 0) {
                len--;
                res[len] = num % 10;
                num = num / 10;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        lt_2553 sol = new lt_2553();
        int[] nums = { 13, 25, 83, 77 };
        int[] result = sol.separateDigits(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 1 3 2 5 8 3 7 7
    }
}