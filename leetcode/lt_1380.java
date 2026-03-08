package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lt_1380 {
     public List<Integer> luckyNumbers(int[][] matrix) {
         int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Collect all row minima
        Set<Integer> rowMins = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            rowMins.add(minVal);
        }

        Set<Integer> colMaxs = new HashSet<>();
        for (int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            colMaxs.add(maxVal);
        }
        List<Integer> result = new ArrayList<>();
        for (Integer val : rowMins) {
            if (colMaxs.contains(val)) {
                result.add(val);
            }
        }

        return result;
    }
    
}
