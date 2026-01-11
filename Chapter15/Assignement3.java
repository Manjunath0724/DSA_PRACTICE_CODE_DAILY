package Chapter15;

public class Assignement3 {
    public static void transpose(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        int transpose[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("The transpose of the given matrix is :");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        transpose(arr);

    }
}
