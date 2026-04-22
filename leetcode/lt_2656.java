package leetcode;

import java.util.Arrays;

public class lt_2656 {

    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int maxSum = 0;
        int largest = nums[nums.length - 1];
        for (int i = 0; i < k; i++) {
            maxSum += largest;
            largest++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        lt_2656 s = new lt_2656();
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;
        int result = s.maximizeSum(nums, k);
        System.out.println(result); // Output: 18
    }
}


// class Solution {
//     public int maximizeSum(int[] nums, int k) {
//         int max=0,prevsum=0;
//          for(int num :nums)
//          {
//             if(num>=max)
//             max=num;
//          }
//         return max*k+k*(k-1)/2;
//     }
// }