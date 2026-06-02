package leetcode;

public class lt_1886 {

    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lt_1886 lt = new lt_1886();
        System.out.println(lt.findRotation(new int[][] { { 0, 1 }, { 1, 0 } }, new int[][] { { 1, 0 }, { 0, 1 } }));
        System.out.println(lt.findRotation(new int[][] { { 0, 1 }, { 1, 1 } }, new int[][] { { 1, 0 }, { 0, 1 } }));
        System.out.println(lt.findRotation(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } },
                new int[][] { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }));
    }
}
