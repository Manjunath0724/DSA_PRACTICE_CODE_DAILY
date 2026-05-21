package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ly_1018 {
    
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val = 0;
        for (int n : nums) {
            val = ((val << 1) + n) % 5;
            res.add(val == 0);
        }
        return res;
    }
    public static void main(String[] args) {
        lt_1018 s = new lt_1018();
        int[] nums = { 0, 1, 1 };
        List<Boolean> result = s.prefixesDivBy5(nums);
        System.out.println(result); // Output: [true, false, false]
    }
}


