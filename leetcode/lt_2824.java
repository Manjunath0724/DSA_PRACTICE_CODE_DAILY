package leetcode;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class lt_2824 {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); // now safe
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        lt_2824 s = new lt_2824();
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5)); // FIXED
        int target = 7;
        int result = s.countPairs(nums, target);
        System.out.println(result);
    }
}