package Chapter15;

public class Assignment1 {
    public static void sum(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Count of 7 is :" + count);
    }
// public static void sum(int[][] arr) {
//     int count = 0;
//     for (int[] row : arr) {
//         for (int val : row) {
//             if (val == 7) {
//                 count++;
//             }
//         }
//     }
//     System.out.println("Count of 7 is: " + count);
// }
    public static void main(String args[]) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        sum(array);

    }
}
