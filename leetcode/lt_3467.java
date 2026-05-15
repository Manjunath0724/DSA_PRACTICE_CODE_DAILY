package leetcode;

public class lt_3467 {

    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            }
        }
        for (int i = 0; i < even; i++) {
            nums[i] = 0;
        }
        for (int i = even; i < nums.length; i++) {
            nums[i] = 1;
        }
        return nums;

    }

public static void main(String[] args) {
        lt_3467 s = new lt_3467();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] result = s.transformArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 0 0 0 1 1 1
}