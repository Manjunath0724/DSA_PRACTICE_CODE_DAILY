package leetcode;

import java.util.Arrays;

import javax.print.attribute.standard.Destination;
import javax.xml.transform.Source;

public class lt_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_1929 sol = new lt_1929();
        int[] nums = { 1, 2, 3 };
        int[] result = sol.getConcatenation(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // public int[] getConcatenation(int[] nums) {
    // int[] ans = new int[nums.length * 2];
    // fill(nums, ans, 0); // start recursion at index 0
    // return ans;
    // }

    // private void fill(int[] nums, int[] ans, int i) {
    // int n = nums.length;
    // // base case: stop when i reaches length
    // if (i == n)
    // return;

    // // recursive step: copy nums[i] into both positions
    // ans[i] = nums[i];
    // ans[i + n] = nums[i];

    // // recurse for next index
    // fill(nums, ans, i + 1);
    // }

    // class Solution {
    // public int[] getConcatenation(int[] a) {
    // int[] b = Arrays.copyOf(a, 2 * a.length);
    // System.arraycopy(a, 0, b, a.length, a.length);
    // return b;
    // }Now: System.arraycopy(a, 0, b, a.length, a.length);
    // Parameters mean:
    // - Source = a
    // - Source start index = 0
    // - Destination = b
    // - Destination start index = a.length = 3
    // - Number of elements to copy = a.length = 3
    // So we copy 3 elements from a[0..2] into b[3..5].

    // // }

}
