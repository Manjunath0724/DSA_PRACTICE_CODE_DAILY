package leetcode;

public class lt_2176 {
    public int countPairs(int[] nums, int k) {

        int count = 0;
        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {

                if ((nums[i] == nums[j]) && (i * j) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        lt_2176 s = new lt_2176();
        int[] nums = { 3, 1, 2, 2, 2, 1, 3 };
        int k = 2;
        int result = s.countPairs(nums, k);
        System.out.println(result);
    }
}