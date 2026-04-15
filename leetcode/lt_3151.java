package leetcode;

public class lt_3151 {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] % 2 == nums[i] % 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lt_3151 s = new lt_3151();
        int[] nums = { 1, 2, 3, 4, 5 };
        boolean result = s.isArraySpecial(nums);
        System.out.println(result);
    }
}
