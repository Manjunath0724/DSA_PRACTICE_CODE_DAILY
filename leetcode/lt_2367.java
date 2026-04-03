package leetcode;
import java.util.*;
class lt_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            seen.put(nums[i], i);
        }
        for (int num : nums) {
            if (seen.containsKey(num + diff) && seen.containsKey(num + 2 * diff)) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        
    }
}


// class Solution {
//     public int arithmeticTriplets(int[] nums, int diff) {
//         HashSet<Integer> set= new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//         int c=0;
//         for(int i=0;i<nums.length;i++){
//             if(set.contains(nums[i]+diff)&&set.contains(nums[i]+diff+diff)){
//                     c++;
//             }
//         }
//         return c;
//     }
// }


// class Solution {
//   public int arithmeticTriplets(int[] nums, int diff) {
//     final int MAX = 200;
//     int ans = 0;
//     boolean[] count = new boolean[MAX + 1];

//     for (final int num : nums) {
//       if (num >= 2 * diff && count[num - diff] && count[num - 2 * diff])
//         ++ans;
//       count[num] = true;
//     }

//     return ans;
//   }
// }