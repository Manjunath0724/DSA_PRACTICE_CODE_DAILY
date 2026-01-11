package Chapter15;

public class Assignment2 {
    // public static void sum(int arr[][]) {
    // int rowStart = 1;
    // int rowEnd = arr.length;
    // int totalSum = 0;
    // for (int i = rowStart; i < rowEnd-1; i++) {
    // totalSum += arr[rowStart][rowEnd];
    // rowEnd++;
    // }
    // System.out.println("The sum of the elements in the 2D array second row is : "
    // + totalSum);
    // }
    public static void sum(int arr[][]) {
        int sum = 0;
        int col = 0;
        int row = 2;
        for (int i = col; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        System.out.println("The sum of the elements in the 2D array second row is : " + sum);
    }

    public static void main(String args[]) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        sum(nums);
    }
}
