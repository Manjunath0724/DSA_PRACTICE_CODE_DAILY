package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lt_1331 {
   c
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        for (int num : sorted) {
            rank.putIfAbsent(num, rank.size() + 1);  // skip duplicates
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.getOrDefault(arr[i], 0);
        }

        return arr;
    }
public static void main(String[] args) {
        lt_1331 s = new lt_1331();
        int[] arr = { 40, 10, 20, 30 };
        int[] result = s.arrayRankTransform(arr);
        System.out.println(Arrays.toString(result)); // Output: [4, 1, 2, 3]
    }
}
