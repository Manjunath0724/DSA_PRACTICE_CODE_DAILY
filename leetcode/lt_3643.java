package leetcode;

public class lt_3643 {

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k >> 1; i++) {
            for (int j = 0; j < k; j++) {
                int temp = grid[x + i][y + j];
                grid[x + i][y + j] = grid[x + k - 1 - i][y + j];
                grid[x + k - 1 - i][y + j] = temp;
            }
        }
        return grid;
    }

public static void main(String[] args) {
        lt_3643 s = new lt_3643();
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int x = 0, y = 0, k = 2;
        int[][] result = s.reverseSubmatrix(grid, x, y, k);
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}



// class Solution {
//     public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
//           for (int i = 0; i < k / 2; i++) {
            
//             int row1 = x + i;
//             int row2 = x + k - 1 - i;
            
            
//             for (int j = 0; j < k; j++) {
//                 int col = y + j;
                
//                 int temp = grid[row1][col];
//                 grid[row1][col] = grid[row2][col];
//                 grid[row2][col] = temp;
//             }
//         }
//         return grid;
//     }
// }
   
    