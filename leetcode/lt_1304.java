package leetcode;

public class lt_1304 {
    // public int[] sumZero(int n) {
    // int[] a = new int[n];
    // int idx = 0;

    // if (n % 2 != 0) {
    // a[idx++] = 0;
    // }

    // for (int i = 1; i <= n / 2; i++) {
    // a[idx++] = i;
    // a[idx++] = -i;
    // }

    // return a;
    // }

    public int[] sumZero(int n) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            // Case 1: If n is odd and we are at the middle index, put 0
            if (n % 2 == 1 && i == n / 2) {
                a[i] = 0;
            }
            // Case 2: If we are in the first half, put positive numbers
            else if (i < n / 2) {
                a[i] = i + 1;
            }
            // Case 3: If we are in the second half, put negative numbers
            else {
                a[i] = -(n - i);
            }
        }

        return a;
        // for (int i = 0; i < n; i++) {
        // a[i] = ((n % 2 == 1) && i == n / 2) ? 0 : (i < n / 2 ? i + 1 : -(n - i));
        // }
    }

    public static void main(String[] args) {
        lt_1304 sol = new lt_1304();
        int n = 5;
        int[] result = sol.sumZero(n);
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
