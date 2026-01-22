
package leetcode;
import java.util.*;

class lt_16 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort the array

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--; // sum too big → move right pointer left
                } else if (total < 0) {
                    j++; // sum too small → move left pointer right
                } else {
                    // Found a valid triplet
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // Skip duplicates for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicates for k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return res;
    }

    // For testing
    public static void main(String[] args) {
        lt_16 sol = new lt_16();

        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = sol.threeSum(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Unique triplets that sum to 0: " + result);
    }
}