package leetcode;

public class lt_3065 {

    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        lt_3065 s = new lt_3065();
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;
        int result = s.minOperations(nums, k);
        System.out.println(result); // Output: 2
    }
}
