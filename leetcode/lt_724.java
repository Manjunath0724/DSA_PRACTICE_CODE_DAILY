package leetcode;

public class lt_724 {

    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightsum = total - leftsum - nums[i];
            if (leftsum == rightsum) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        lt_724 sol = new lt_724();
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int result = sol.pivotIndex(nums);
        System.out.println(result); // Output: 3
    }
}
