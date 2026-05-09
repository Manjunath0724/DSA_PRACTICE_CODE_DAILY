package leetcode;

public class lt_908 {

    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int val : nums) {
            if (val < min)
                min = val;
            if (val > max)
                max = val;
        }
        return (min + k) > (max - k) ? 0 : (max - k) - (min + k);
    }

public static void main(String[] args) {
    lt_908 s = new lt_908();
    int[] nums = {1, 3, 6};
    int k = 3;
    int result = s.smallestRangeI(nums, k);
    System.out.println(result); // Output: 0
}
