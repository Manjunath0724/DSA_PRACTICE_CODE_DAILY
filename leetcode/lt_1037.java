package leetcode;

public class lt_1037 {

    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]) != (points[2][1] - points[1][1])
                * (points[1][0] - points[0][0]);
    }

    public static void main(String[] args) {
        lt_1037 lt = new lt_1037();
        int[][] points = { { 1, 1 }, { 2, 3 }, { 3, 2 } };
        System.out.println(lt.isBoomerang(points));
    }
}
