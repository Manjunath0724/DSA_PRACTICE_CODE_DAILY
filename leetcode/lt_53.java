package leetcode;

public class lt_53 {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int best_ending = nums[0];
        int ans = nums[0];

        for (i = 1; i < nums.length; i++) {
            int v1 = best_ending + nums[i];
            int v2 = nums[i];
            best_ending = Math.max(v1, v2);
            ans = Math.max(ans, best_ending);
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_53 sol = new lt_53();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = sol.maxSubArray(nums);
        System.out.println(result);
    }
}
//optimal apporach
//  public static int maxSubArray(int[] nums){
//         int currentSum = 0;
//         int maxSum = nums[0];

//         for (int i = 0; i < nums.length; i++){
//             currentSum += nums[i];
//             maxSum = Math.max(currentSum , maxSum);

//             if(currentSum < 0){
//                 currentSum = 0;
//             }
//         }
//         return maxSum;

//     }
// --- optimal approach  can be done in o(nlog) using divide and conquer approach---