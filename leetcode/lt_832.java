package leetcode;

public class lt_832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            int left = 0, right = n - 1;
            while (left <= right) {
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;
                left++;
                right--;
            }
        }
        return image; // returning the modified array
    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        lt_832 sol = new lt_832();
        int[][] result = sol.flipAndInvertImage(image);

        // Print result
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
