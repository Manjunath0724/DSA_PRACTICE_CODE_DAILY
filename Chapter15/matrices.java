package Chapter15;

import java.util.*;

public class matrices {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at:" + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key element not found in the matrix!");
        return false;
    }

    public static void largest(int martrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < martrix.length; i++) {
            for (int j = 0; j < martrix[0].length; j++) {
                if (martrix[i][j] > largest) {
                    largest = martrix[i][j];

                }
            }
        }
        System.out.println("The largest element is :" + largest);
    }

    public static void smallest(int martrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < martrix.length; i++) {
            for (int j = 0; j < martrix[0].length; j++) {
                if (martrix[i][j] < smallest) {
                    smallest = martrix[i][j];

                }
            }
        }
        System.out.println("The smallest element is :" + smallest);
    }

    public static void main(String args[])

    {
        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // search(matrix, 5);
        int mat[][] = {
                { 11, 21, 31 },
                { 44, 71, 81 },
                { 99, 98, 10 }
        };
        largest(mat);
        smallest(mat);
    }

}
