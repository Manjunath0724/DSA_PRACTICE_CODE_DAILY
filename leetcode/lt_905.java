package leetcode;

public class lt_905 {
    public int[] sortArrayByParity(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        lt_905 sol = new lt_905();
        int[] nums = { 3, 1, 2, 4 };
        int[] result = sol.sortArrayByParity(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
// class Solution {
// public static int[] sortArrayByParity(int[] nums) {
// int left = 0, right = nums.length - 1;

// while (left < right) {
// if ((nums[left] & 1) == 1) { // odd
// int temp = nums[left];
// nums[left] = nums[right];
// nums[right] = temp;
// right--;
// } else {
// left++;
// }
// }

// return nums;
// }

// }

// - 4 in binary → 100
// 4 & 1 = 100 & 001 = 000 → 0 → even
// - 7 in binary → 111
// 7 & 1 = 111 & 001 = 001 → 1 → odd
// - 0 in binary → 000
// 0 & 1 = 000 & 001 = 000 → 0 → even
