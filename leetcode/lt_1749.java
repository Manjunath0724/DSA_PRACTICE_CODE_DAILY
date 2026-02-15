package leetcode;

public class lt_1749 {

    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        // Kadane's algorithm to find max and min subarray sums
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            minEndingHere = Math.min(nums[i], minEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }

        // The maximum absolute sum is the maximum of the absolute values of maxSoFar
        // and minSoFar
        return Math.max(Math.abs(maxSoFar), Math.abs(minSoFar));
    }

    public static void main(String[] args) {
        lt_1749 lt = new lt_1749();
        int[] nums = { 1, -3, 2, 3, -4 };
        System.out.println(lt.maxAbsoluteSum(nums)); // Output: 5
    }
}


// class Solution {
//     public int maxAbsoluteSum(int[] nums) {
//         int ans = 0,ans1 = 0;
//         int sum = 0;
//         for (int i =0;i<nums.length;i++){
//             sum += nums[i];
//             if(sum > ans) ans = sum;
//             if(sum < ans1) ans1 = sum;
//         }
//         return Math.abs(ans-ans1);
//     }
// }