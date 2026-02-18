package leetcode;

import java.util.HashMap;

public class lt_219 {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.containsKey(arr[i])) {
                if (i - list.get(arr[i]) <= k) {
                    return true;
                }
            }
            list.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        lt_219 sol = new lt_219();
        int[] arr = { 1, 2, 3, 1 };
        int k = 2;
        boolean result = sol.containsNearbyDuplicate(arr, k);
        System.out.println(result); // Output: true
    }
}
