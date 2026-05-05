package leetcode;

public class lt_1252 {

    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for (int[] index : indices) {
            rowCount[index[0]]++;
            colCount[index[1]]++;
        }

        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rowCount[i] + colCount[j]) % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }

    public static void main(String[] args) {
        lt_1252 s = new lt_1252();
        int m = 2;
        int n = 3;
        int[][] indices = { { 0, 1 }, { 1, 1 } };
        int result = s.oddCells(m, n, indices);
        System.out.println(result); // Output: 6
    }
}
