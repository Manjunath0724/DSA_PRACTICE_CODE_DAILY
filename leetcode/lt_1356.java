package leetcode;

import java.util.Arrays;

public class lt_1356 {
    public int[] sortByBits(int[] arr) {
        final int MAGIC_NUMBER = 10001;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * MAGIC_NUMBER;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= MAGIC_NUMBER;
        }
        return arr;

    }

    public static void main(String[] args) {
        lt_1356 sol = new lt_1356();
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] result = sol.sortByBits(arr);
        System.out.println(Arrays.toString(result)); // Output: [0, 1, 2, 4, 8, 3, 5, 6, 7]
    }
}
