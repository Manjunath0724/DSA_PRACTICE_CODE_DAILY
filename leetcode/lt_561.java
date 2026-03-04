package leetcode;

import java.util.Arrays;

public class lt_561 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        lt_561 sol = new lt_561();
        int result = sol.arrayPairSum(nums);
        System.out.println(result); // Output: 4
    }
}


// class Solution {
//     public int arrayPairSum(int[] nums) {
        
//         Arrays.sort(nums);
//         int sum=0;
//         for(int i=0;i<nums.length;i+=2)
//         {
//             sum+=nums[i];
//         }
//       return sum ;
//     }
// }