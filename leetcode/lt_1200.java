package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lt_1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int currentDiff = arr[i + 1] - arr[i];
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (currentDiff == minDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        lt_1200 s = new lt_1200();
        int[] arr = {4, 2, 1, 3};
        List<List<Integer>> result = s.minimumAbsDifference(arr);
        System.out.println(result); // Output: [[1, 2], [2, 3], [3, 4]]
    }
}
