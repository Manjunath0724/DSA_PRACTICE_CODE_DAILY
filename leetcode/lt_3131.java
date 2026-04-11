package leetcode;

public class lt_3131 {

    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums1) {
            min1 = Math.min(min1, num);
        }
        for (int num : nums2) {
            min2 = Math.min(min2, num);
        }

        return min2 - min1;
    }

    public static void main(String[] args) {
        lt_3131 s = new lt_3131();
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 4, 5, 6 };
        int result = s.addedInteger(nums1, nums2);
        System.out.println(result);
    }
}
