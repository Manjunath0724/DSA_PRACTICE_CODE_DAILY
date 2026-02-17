package leetcode;

import java.util.*;

class lt_349 {
    public int[] intersection(int[] arr1, int[] arr2) {
        // --- Approach 1: HashSet (commented out) ---
        // HashSet<Integer> list = new HashSet<>();
        // HashSet<Integer> list1 = new HashSet<>();
        // for (int i : arr1) {
        // list.add(i);
        // }
        // for (int i : arr2) {
        // if (list.contains(i)) {
        // list1.add(i);
        // }
        // }
        // int[] ans = new int[list1.size()];
        // int count = 0;
        // for (int i : list1) {
        // ans[count++] = i;
        // }
        // return ans;

        // --- Approach 2: Sorting + Two Pointers ---
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Remove duplicates
        Set<Integer> unique = new HashSet<>(result);
        int[] ans = new int[unique.size()];
        int k = 0;
        for (int val : unique) {
            ans[k++] = val;
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_349 sol = new lt_349();
        int[] arr1 = { 12, 45, 65, 78 };
        int[] arr2 = { 36, 65, 78, 98 };

        int[] intersection = sol.intersection(arr1, arr2);

        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}
// // Example usage
// public static void main(String[] args) {
// Solution sol = new Solution();
// int[] arr1 = {12, 45, 65, 78};
// int[] arr2 = {36, 65, 78, 98};

// int[] intersection = sol.intersection(arr1, arr2);

// System.out.println("Intersection: " + Arrays.toString(intersection));
// }
// }