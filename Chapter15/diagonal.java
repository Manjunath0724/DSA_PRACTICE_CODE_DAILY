package Chapter15;

public class diagonal {
    // Brute force means the time complexity will be O(n^2)
    // public static int DiagonalMatrix(int matrix[][]) {
    // int sum = 0;
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix.length; j++) {
    // if (i == j) {
    // sum += matrix[i][j];
    // } else if (i + j == matrix.length - 1) {
    // sum += matrix[i][j];
    // }
    // }
    // }
    // return sum;
    // }

    // Optimal approach with time complexity O(n)
    public static int DiagonalMatrix(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("The sum of the Diagonal Matrix is :" + DiagonalMatrix(matrix));
    }
}
