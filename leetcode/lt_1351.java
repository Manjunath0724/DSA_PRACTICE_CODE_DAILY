package leetcode;

public class lt_1351 {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = m - 1;
        int col = 0;
        int count = 0;
        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                count += (n - col);
                row--;
            } else {
                col++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        lt_1351 sol = new lt_1351();
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };
        System.out.println(sol.countNegatives(grid)); // Output: 8
    }
}
