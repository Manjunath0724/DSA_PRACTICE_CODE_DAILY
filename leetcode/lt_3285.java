package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lt_3285 {

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            // Check if the previous mountain is strictly greater than threshold
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        lt_3285 s = new lt_3285();
        int[] height = { 1, 3, 2, 4, 5 };
        int threshold = 2;
        List<Integer> result = s.stableMountains(height, threshold);
        System.out.println(result);
    }

}
