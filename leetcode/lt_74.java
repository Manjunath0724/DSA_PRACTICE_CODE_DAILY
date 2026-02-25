package leetcode;

public class lt_74 {
    /// Brute force my logic ------> time complexity O(rows*cols)
    // int rows = matrix.length;
    // int cols = matrix[0].length;
    // int[] flatArray = new int[rows * cols];

    // // Flatten the matrix
    // int index = 0;
    // for (int i = 0; i < rows; i++) {
    // for (int j = 0; j < cols; j++) {
    // flatArray[index++] = matrix[i][j];
    // }
    // }
    // int left = 0;
    // int right = flatArray.length - 1;

    // while (left <= right) {
    // // Find the middle index
    // int mid = left + (right - left) / 2;

    // // Check if target is at mid
    // if (flatArray[mid] == target) {
    // return true; // Found, return index
    // }

    // // If target is smaller, ignore right half
    // if (flatArray[mid] > target) {
    // right = mid - 1;
    // }
    // // If target is larger, ignore left half
    // else {
    // left = mid + 1;
    // }
    // }

    // // Element not found
    // return false;
    // ----------------------------------------------------------------------------------------------------
    // time complexity --->OO(n+logm)
    // best approach by me
    // int rows = matrix.length;
    // int cols = matrix[0].length;

    // // Step 1: Identify the correct row
    // int row = -1;
    // for (int i = 0; i < rows; i++) {
    // if (target <= matrix[i][cols - 1]) {
    // row = i;
    // break;
    // }
    // }

    // // If no row found, target is larger than all row ends
    // if (row == -1)
    // return false;

    // // Step 2: Binary search in that row
    // int left = 0, right = cols - 1;
    // while (left <= right) {
    // int mid = left + (right - left) / 2;
    // if (matrix[row][mid] == target) {
    // return true;
    // } else if (matrix[row][mid] > target) {
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }
    // }

    // return false;

    // optimal appraoch ----->OLog(m*n)
    boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchPotentialRow(matrix, target);
        if (rowIdx != -1)
            return binarySearchOverRow(rowIdx, matrix, target);
        else
            return false;
    }

    private int searchPotentialRow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length - 1]) {
                return mid;
            } else if (matrix[mid][0] < target) {
                low = mid + 1;
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    private boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target) {
        int low = 0;
        int high = matrix[rowIdx].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[rowIdx][mid] == target)
                return true;
            else if (matrix[rowIdx][mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;

    }

    public static void main(String[] args) {
        lt_74 obj = new lt_74();
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println("Result: " + result);
    }
}
