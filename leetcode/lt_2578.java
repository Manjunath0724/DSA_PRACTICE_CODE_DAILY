package leetcode;

public class lt_2578 {
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            res[i] = Math.abs(rightSum - leftSum);
            rightSum -= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        lt_2578 s = new lt_2578();
        int[] nums = { 10, 4, 8, 3 };
        int[] result = s.leftRightDifference(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
