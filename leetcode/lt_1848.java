package leetcode;

public class lt_1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int current = Math.abs(i - start);
                if (current < index) {
                    index = current;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        lt_1848 sol = new lt_1848();
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 5;
        int start = 3;
        int result = sol.getMinDistance(nums, target, start);
        System.out.println(result); // Output: 1
    }
}
