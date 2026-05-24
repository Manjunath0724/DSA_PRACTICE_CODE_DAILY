package leetcode;

public class lt_463 {

    public int islandPerimeter(int[][] grid) {
        int peri = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    peri += 4;
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        peri -= 2;
                    }
                    if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                        peri -= 2;
                    }
                }
            }
        }
        return peri;

    }

public static void main(String[] args) {
    lt_463 s = new lt_463();
    int[][] grid = {{0,1,0,0},
                    {1,1,1,0},
                    {0,1,0,0},
                    {1,1,0,0}};
    int result = s.islandPerimeter(grid);
    System.out.println(result);
}
