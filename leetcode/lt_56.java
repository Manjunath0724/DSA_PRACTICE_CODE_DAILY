package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lt_56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] newinterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= newinterval[1]) {
                newinterval[1] = Math.max(newinterval[1], interval[1]);

            } else {
                merged.add(newinterval);
                newinterval = interval;
            }

        }
        merged.add(newinterval);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        lt_56 obj = new lt_56();
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] res = obj.merge(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }

}
