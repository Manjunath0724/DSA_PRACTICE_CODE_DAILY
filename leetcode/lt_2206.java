package leetcode;

public class lt_2206 {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= 500; i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lt_2206 sol = new lt_2206();
        int[] nums = { 3, 2, 3, 2, 2, 2 };
        boolean result = sol.divideArray(nums);
        System.out.println(result); // Output: true
    }
}
