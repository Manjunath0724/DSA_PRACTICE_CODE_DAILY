package leetcode;

import java.util.Arrays;

public class lt_1619 {

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int cut = n / 20;
        double sum = 0;

        for (int i = cut; i < n - cut; i++) {
            sum += arr[i];
        }
        return sum / (n - 2 * cut);
    }

    public static void main(String[] args) {
        lt_1619 sol = new lt_1619();
        int[] arr = { 6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0 };
        double result = sol.trimMean(arr);
        System.out.println(result);
}
}