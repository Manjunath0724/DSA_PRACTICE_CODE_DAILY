package leetcode;

public class lt_1266 {

    public int minTimeToVisitAllPoints(int[][] p) {
        int ans = 0;

        for (int i = 1; i < p.length; i++) {

            ans += Math.max(
                    Math.abs(p[i][0] - p[i - 1][0]), // |dx| horizontal distance
                    Math.abs(p[i][1] - p[i - 1][1]) // |dy| vertical distance
            );
        }

        return ans;
    }

    public static void main(String[] args) {
        lt_1266 s = new lt_1266();
        int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
        int result = s.minTimeToVisitAllPoints(points);
        System.out.println(result); // Output: 7
    }
}
