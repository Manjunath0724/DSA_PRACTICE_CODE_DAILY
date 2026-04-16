package leetcode;

import java.util.Arrays;

public class lt_2974 {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        lt_2974 s = new lt_2974();
        int[] nums = { 3, 1, 2, 5, 4 };
        int[] result = s.numberGame(nums);
        System.out.println(Arrays.toString(result));
    }
}
