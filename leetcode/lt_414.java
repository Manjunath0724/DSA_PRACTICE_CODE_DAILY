package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lt_414 {
    public int thirdMax(int[] nums) {
        // o(n)
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int n : nums) {

            if (n == first || n == second || n == third) {
                continue;
            }

            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;

    }
    // o(n log n) due to sorting
    // // Step 1: Put all elements into a set to remove duplicates
    // Set<Integer> set = new HashSet<>();
    // for (int n : nums) {
    // set.add(n);
    // }

    // // Step 2: Convert set to list and sort in descending order
    // List<Integer> distinct = new ArrayList<>(set);
    // Collections.sort(distinct, Collections.reverseOrder());

    // // Step 3: Return third maximum if it exists, otherwise return maximum
    // if (distinct.size() >= 3) {
    // return distinct.get(2); // third largest
    // } else {
    // return distinct.get(0); // largest
    // }

    public static void main(String[] args) {
        lt_414 sol = new lt_414();
        int[] nums = { 3, 2, 1 };
        System.out.println(sol.thirdMax(nums)); // Output: 1
    }
}
