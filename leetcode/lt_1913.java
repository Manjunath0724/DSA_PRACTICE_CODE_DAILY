package leetcode;

import java.util.Arrays;

public class lt_1913 {
    // my approach
    // public int maxProductDifference(int[] nums) {
    // Arrays.sort(nums);
    // int l1 = nums[nums.length - 1];
    // int l2 = nums[nums.length - 2];
    // int l3 = nums[0];
    // int l4 = nums[1];

    // int p1 = l1 * l2;
    // int p2 = l3 * l4;
    // int diff = p1 - p2;

    // return diff;
    // }
    public int maxProductDifference(int[] nums) {
        // Arrays.sort(nums);
        // int l1=nums[nums.length-1];
        // int l2=nums[nums.length-2];
        // int l3=nums[0];
        // int l4=nums[1];

        // int p1=l1*l2;
        // int p2=l3*l4;
        // int diff=p1-p2;

        // return diff;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < minlt2) {
                min2 = num;
            }
        }

        return (max1 * max2) - (min1 * min2);
    }

    public static void main(String[] args) {
        lt_1913 sol = new lt_1913();
        int[] nums = { 5, 6, 2, 7, 4 };
        int result = sol.maxProductDifference(nums);
        System.out.println(result); // Output: 34
    }
}
