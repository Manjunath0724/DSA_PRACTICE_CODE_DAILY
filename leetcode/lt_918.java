package leetcode;

public class lt_918 {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currMin);

            totalSum += nums[i];
        }

        int circularSum = totalSum - minSum;
        if (circularSum == 0) {
            return maxSum;
        }

        return Math.max(circularSum, maxSum);
    }

    public static void main(String[] args) {
        lt_918 lt = new lt_918();
        int[] nums = { 1, -2, 3, -2 };
        System.out.println(lt.maxSubarraySumCircular(nums)); // Output: 3
    }
}


// class Solution {
//     public int maxsubarray(int[] nums){
//             int currentsum=0;
//             int maxsum=nums[0];
//             for(int i=0;i<nums.length;i++){
//                 currentsum+=nums[i];

//                 if(currentsum>maxsum){
//                     maxsum=currentsum;
//                 }
//                 if(currentsum<0){
//                     currentsum=0;
//                 }
//             }
//             return maxsum;
//         }
//     public int minsubarray(int[] nums){
//             int currentsum=0;
//             int minsum=nums[0];
//             for(int i=0;i<nums.length;i++){
//                 currentsum+=nums[i];
//                 if(currentsum<minsum){
//                     minsum=currentsum;
                    
//                 }
//                 if(currentsum>0){
//                     currentsum=0;
//                 }
//             }
//             return minsum;
//         }
//     public int maxSubarraySumCircular(int[] nums) {
        
        

//         int max_subarray=maxsubarray(nums);
//         int min_subarray=minsubarray(nums);
//         int total=0;
//         for(int i=0;i<nums.length;i++){
//             total+=nums[i];
//         }
//         if(total==min_subarray){
//             return max_subarray;
//         }
//         return Math.max(max_subarray,total-min_subarray);

        
//     }
// }


// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//         int sum=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, totalSum=0;
//         for(int num:nums){
//             sum = Math.max(num, num+sum);
//             max = Math.max(max, sum);
//             totalSum+=num;
//         }
//         sum=0;
//         for(int num:nums){
//             sum = Math.min(num, num+sum);
//             min = Math.min(min, sum);
//         }
//         return max<0 ? max : Math.max(max, totalSum-min);
//     }
// }


// class Solution {
//     private int totalSum = 0;
//     private int kadane(int[]nums, boolean isMax){
//         int sum = nums[0];
//         int curr_sum = nums[0];
//         totalSum = nums[0];
//         for(int i=1;i<nums.length;i++){
//             totalSum += nums[i];
//             if(isMax){
//                 curr_sum = Math.max(nums[i],nums[i] + curr_sum);
//                 sum = Math.max(curr_sum,sum);
//             }else{
//                 curr_sum = Math.min(nums[i],nums[i] + curr_sum);
//                 sum = Math.min(curr_sum,sum);
//             }
//         }
//         return sum;
//     }

//     public int maxSubarraySumCircular(int[] nums) {

//         int maxSum = kadane(nums,true);
//         int minSum = kadane(nums,false);
//         if(minSum == totalSum) return maxSum;
//         return Math.max(maxSum, totalSum - minSum);
//         // int currMin = nums[0], currMax = nums[0], minSum = nums[0], maxSum = nums[0];
//         // int totalSum = nums[0];

//         // for(int i=1; i<nums.length; i++){
//         //     currMax = Math.max(nums[i], currMax+nums[i]);
//         //     maxSum = Math.max(maxSum, currMax);

//         //     currMin = Math.min(nums[i], currMin+nums[i]);
//         //     minSum = Math.min(minSum, currMin);

//         //     totalSum += nums[i];
//         // }

//         // if(minSum == totalSum) return maxSum;
//         // return Math.max(maxSum, totalSum-minSum);
//     }
// }