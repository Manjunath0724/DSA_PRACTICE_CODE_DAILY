package leetcode;

public class lt_2639 {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, String.valueOf(grid[j][i]).length());
            }
            ans[i] = max;
        }
        return ans;
    }
lt-    public static void main(String[] args) {
        lt_2639 s = new lt_2639();
        int[][] grid = { { 1, 22, 333 }, { 4444, 55555, 666666 } };
        int[] result = s.findColumnWidth(grid);
        for (int width : result) {
            System.out.print(width + " "); // Output: 4 5 6
        }
    }
}
