package leetcode;

public class lt_287 {
    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (true) {
            slow = nums[slow];
            // fast = nums[fast];
            // fast = nums[fast];
            fast = nums[nums[fast]];
            if (slow == fast) {
                slow = 0;
                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }

        }
    }

    public static void main(String[] args) {
        lt_287 sol = new lt_287();
        int[] nums = { 1, 3, 4, 2, 2 };
        int duplicate = sol.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
}

//Good solution but uses O(n) space
// class Solution {
//     public int findDuplicate(int[] nums) {
//         boolean[] freq = new boolean[nums.length];
        
//         for (int num : nums) {
//             if (freq[num]) return num;
//             freq[num] = true;
//         }

//         return -1;
//     }
// }