package leetcode;

public class lt_1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int front = 0;
        int back = 0;
        for (int i = start; i != destination; i = (i + 1) % distance.length) {
            front += distance[i];
        }
        for (int i = destination; i != start; i = (i + 1) % distance.length) {
            back += distance[i];
        }
        return Math.min(front, back);
    }

    public static void main(String[] args) {
        lt_1184 sol = new lt_1184();
        int[] distance = { 1, 2, 3, 4 };
        int start = 0;
        int destination = 2;
        int result = sol.distanceBetweenBusStops(distance, start, destination);
        System.out.println(result);
    }
}
