package leetcode;

public class lt_152 {

    public int maxProduct(int[] nums) {
        int i = 0;
        int maxend = nums[0];
        int minend = nums[0];
        int res = nums[0];
        for (i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = maxend * nums[i];
            int v3 = minend * nums[i];
            maxend = Math.max(v1, Math.max(v2, v3));
            minend = Math.min(v1, Math.min(v2, v3));
            res = Math.max(res, Math.max(maxend, minend));

        }
        return res;
    }

    public static void main(String[] args) {
        lt_152 sol = new lt_152();
        int[] nums = { 2, 3, -2, 4 };
        int result = sol.maxProduct(nums);
        System.out.println(result);
    }

    // Here’s the compact dry run for `[2, 3, -2, 4]` in chat form:

    // - Start → `maxend=2, minend=2, res=2`
    // - At `3` → `maxend=6, minend=3, res=6`
    // - At `-2` → `maxend=-2, minend=-12, res=6`
    // - At `4` → `maxend=4, minend=-48, res=6`

    // 👉 Final result: **6** (subarray `[2, 3]`).

}
