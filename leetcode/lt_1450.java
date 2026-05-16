package leetcode;

public class lt_1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;

    }

public static void main(String[] args) {
        lt_1450 s = new lt_1450();
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;
        int result = s.busyStudent(startTime, endTime, queryTime);
        System.out.println(result); // Output: 1
}
