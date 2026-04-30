package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lt_2089 {

    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, equal = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num < target)
                less++;
            else if (num == target)
                equal++;
        }

        for (int i = less; i < less + equal; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        lt_2089 s = new lt_2089();
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;
        List<Integer> result = s.targetIndices(nums, target);
        System.out.println(result); // Output: [1, 2]
    }
}
