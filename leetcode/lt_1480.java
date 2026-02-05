package leetcode;

public class lt_1480 {
    public int[] runningSum(int[] nums) {
        for (int j = 1; j < nums.length; j++) {
            nums[j] += nums[j - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        lt_1480 sol = new lt_1480();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = sol.runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

// class Solution {
// public int[] sumcalc(int[] arr, int i, int sum, int[] result) {
// if (i == arr.length) {
// return result;
// }
// sum += arr[i];
// result[i] = sum;
// return sumcalc(arr, i + 1, sum, result);
// }
// public int[] runningSum(int[] nums) {
// int[] result = new int[nums.length];
// return sumcalc(nums, 0, 0, result);
// }
// }

// - Start: i=0, sum=0, result=[0,0,0,0]
// - Step 1: sum=1, result[0]=1 → [1,0,0,0]
// - Step 2: sum=3, result[1]=3 → [1,3,0,0]
// - Step 3: sum=6, result[2]=6 → [1,3,6,0]
// - Step 4: sum=10, result[3]=10 → [1,3,6,10]
// - Base case: i=4 → recursion ends.
// ✅ Final output: [1, 3, 6, 10]
