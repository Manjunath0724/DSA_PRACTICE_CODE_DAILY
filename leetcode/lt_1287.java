package leetcode;

public class lt_1287 {

    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int quarter = n / 4;

        for (int i = 0; i < n - quarter; i++) {
            if (arr[i] == arr[i + quarter]) {
                return arr[i];
            }
        }

        return -1;

    }

public static void main(String[] args) {
        lt_1287 s = new lt_1287();
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int result = s.findSpecialInteger(arr);
        System.out.println(result); // Output: 6
}
