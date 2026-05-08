import java.util.ArrayList;
import java.util.List;
package leetcode;

public class lt_2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        /**
         * Since we have 3 arrays of numbers,
         * we need 3 boolean arrays.
         * Here is the length of the longest
         * array that can reach the length of the array
         */
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];

        /**
         * where values of the boolean array
         * at the corresponding index are changed to true
         */
        for (int num : nums1)
            b1[num] = true;

        for (int num : nums2)
            b2[num] = true;

        for (int num : nums3)
            b3[num] = true;

        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if ((b1[i] || b2[i]) && (b2[i] || b3[i]) && (b3[i] || b1[i]))
                res.add(i);
        }
        return res;

    }

    public static void main(String[] args) {
        lt_2032 s = new lt_2032();
        int[] nums1 = { 1, 1, 3, 2 };
        int[] nums2 = { 2, 3 };
        int[] nums3 = { 3 };
        List<Integer> result = s.twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result); // Output: [3, 2]
    }
}
