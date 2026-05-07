package leetcode;

public class lt_1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int totalSubarrays = (i + 1) * (n - i);
            int oddSubarrays = (totalSubarrays + 1) / 2;
            totalSum += oddSubarrays * arr[i];
        }

        return totalSum;
    }

    public static void main(String[] args) {
        lt_1588 s = new lt_1588();
        int[] arr = { 1, 4, 2, 5, 3 };
        int result = s.sumOddLengthSubarrays(arr);
        System.out.println(result); // Output: 58
    }
}