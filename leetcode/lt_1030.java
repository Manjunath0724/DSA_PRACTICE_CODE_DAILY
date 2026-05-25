package leetcode;

public class lt_1030 {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] result = new int[R * C][];
        result[0] = new int[] { r0, c0 };
        int resultIdx = 1;
        int lim = Math.max(r0, R - r0 - 1) + Math.max(c0, C - c0 - 1);

        for (int dist = 1; dist <= lim; dist++) {
            int r = r0 - dist;
            int c = c0;

            for (int count = dist; count > 0; count--) {
                if (r >= 0 && c >= 0)
                    result[resultIdx++] = new int[] { r, c };
                r++;
                c--;
            }

            for (int count = dist; count > 0; count--) {
                if (r < R && c >= 0)
                    result[resultIdx++] = new int[] { r, c };
                r++;
                c++;
            }

            for (int count = dist; count > 0; count--) {
                if (r < R && c < C)
                    result[resultIdx++] = new int[] { r, c };
                r--;
                c++;
            }

            for (int count = dist; count > 0; count--) {
                if (r >= 0 && c < C)
                    result[resultIdx++] = new int[] { r, c };
                r--;
                c--;
            }
        }
        return result;

    }

public static void main(String[] args) {
    lt_1030 s = new lt_1030();
    int R = 1, C = 2, r0 = 0, c0 = 0;
    int[][] result = s.allCellsDistOrder(R, C, r0, c0);
    for (int[] cell : result) {
        System.out.println("[" + cell[0] + ", " + cell[1] + "]");
    }
}
