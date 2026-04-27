package leetcode;

public class lt_1572 {

    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        lt_1572 s = new lt_1572();
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int result = s.diagonalSum(mat);
        System.out.println(result); // Output: 25
    }
}


// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int n = mat.length;
//         int sum = 0;

//         for (int i = 0; i < n; i++) {
//             sum += mat[i][i];             // Primary diagonal
//             sum += mat[i][n - 1 - i];    // Secondary diagonal
//         }

//         // If odd size, center element is added twice — remove once
//         if (n % 2 == 1) {
//             sum -= mat[n / 2][n / 2];
//         }

//         return sum;
//     }
// }