package leetcode;

public class lt_169 {
    public int majorityElement(int[] nums) {
        int curr = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                curr = nums[i];
            }
            if (nums[i] == curr) {
                count++;
            } else {
                count--;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        lt_169 obj = new lt_169();
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int result = obj.majorityElement(nums);
        System.out.println(result);
    }
}
