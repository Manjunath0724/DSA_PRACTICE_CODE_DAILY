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
