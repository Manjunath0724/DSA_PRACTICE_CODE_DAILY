package leetcode;

import java.util.Arrays;

public class lt_1636 {
    public int[] frequencySort(int[] nums) {
        int[] count = new int[201];
        for (int num : nums) {
            count[num + 100]++;
        }
        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArr, (a, b) -> {
            if (count[a + 100] == count[b + 100]) {
                return b - a;
            }
            return count[a + 100] - count[b + 100];
        });
        return Arrays.stream(numsArr).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        lt_1636 sol = new lt_1636();
        int[] nums = { 1, 1, 2, 2, 2, 3 };
        int[] result = sol.frequencySort(nums);
        System.out.println(Arrays.toString(result)); // Output: [3, 1, 1, 2, 2, 2]
    }
}
