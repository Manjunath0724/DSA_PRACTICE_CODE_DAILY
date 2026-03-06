package leetcode;

import java.util.Arrays;

public class lt_1051 {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        // int[] expected = Arrays.copyOf(heights, heights.length);

        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        lt_1051 sol = new lt_1051();
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        int result = sol.heightChecker(heights);
        System.out.println(result); // Output: 3

    }
}

// optimal approach
// class Solution {
// public int heightChecker(int[] heights) {
// int[] count = new int[101]; // Step 1: frequency array
// for (int h : heights) {
// count[h]++; // Step 2: count occurrences of each height
// }

// int result = 0;
// int index = 0;
// for (int h = 1; h <= 100; h++) { // Step 3: reconstruct sorted order
// while (count[h] > 0) {
// if (heights[index] != h) { // Step 4: compare with original
// result++; // mismatch → student out of place
// }
// index++;
// count[h]--; // move to next occurrence
// }
// }

// return result; // Step 5: return total mismatches
// }
// }