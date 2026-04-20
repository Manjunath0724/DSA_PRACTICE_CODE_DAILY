package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lt_3731 {

    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        boolean[] seen = new boolean[101];

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            seen[n] = true;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = min; i <= max; i++)
            if (!seen[i])
                res.add(i);

        return res;
    }

    public static void main(String[] args) {
        lt_3731 s = new lt_3731();
        int[] nums = { 1, 3, 5, 7 };
        List<Integer> result = s.findMissingElements(nums);
        System.out.println(result);
    }
}
