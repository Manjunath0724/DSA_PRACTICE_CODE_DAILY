package leetcode;

class lt_27 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                // Skip trailing vals at the back
                while (left <= right && nums[right] == val) {
                    right--;
                }
                if (left <= right) {
                    // Swap unwanted element at left with valid element at right
                    nums[left] = nums[right];
                    right--;
                }
            } else {
                left++;
            }
        }
        return left; // number of non-val elements
    }

    // Simple test runner
    public static void main(String[] args) {
        lt_27 sol = new lt_27();
        int[] nums = { 3, 2, 3, 2, 2, 3 };
        int val = 3;

        int k = sol.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

// class Solution {
// public int removeElement(int[] nums, int val) {
// int k = 0;

// for (int i = 0; i < nums.length; i++) {
// if (nums[i] != val) {
// nums[k] = nums[i];
// k++;
// }
// }

// return k;
// }
// }