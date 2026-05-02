package leetcode;

import java.util.Arrays;

public class lt_2500 {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;

        for (int[] row : grid) {
            Arrays.sort(row);
        }

        for (int j = 0; j < n; j++) {
            int maxVal = 0;

            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, grid[i][j]);
            }

            sum += maxVal;
        }

        return sum;
    }

    public static void main(String[] args) {
        lt_2500 s = new lt_2500();
        int[][] grid = { { 1, 2, 4 }, { 3, 3, 1 } };
        int result = s.deleteGreatestValue(grid);
        System.out.println(result); // Output: 8
    }
}
