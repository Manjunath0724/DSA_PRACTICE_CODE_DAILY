package leetcode;

public class lt_1748 {
    public int sumOfUnique(int[] nums) {
        int[] hash = new int[101];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < 101; i++) {
            if (hash[i] == 1)
                ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_1748 sol = new lt_1748();
        int[] nums = { 1, 2, 3, 2 };
        int result = sol.sumOfUnique(nums);
        System.out.println(result);
    }
}
// class Solution {
// public int sumOfUnique(int[] nums) {
// int[] unique = new int[101];
// int ans = 0;
// for (int num : nums) {
// unique[num - 1]++;
// if (unique[num - 1] == 1)
// ans += num;
// else if (unique[num - 1] == 2)
// ans -= num;
// }
// return ans;
// }
// }