package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lt_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count occurrences using an array
        int[] freq = new int[2001]; // covers range -1000 to 1000
        for (int num : arr) {
            freq[num + 1000]++; // offset by 1000
        }

        // Step 2: Track seen counts
        boolean[] seen = new boolean[arr.length + 1];
        // max possible frequency = arr.length

        for (int count : freq) {
            if (count > 0) {
                if (seen[count]) {
                    return false; // duplicate frequency found
                }
                seen[count] = true;
            }
        }
        return true;
        // }
        // public boolean uniqueOccurrences(int[] arr) {
        // Map<Integer, Integer> freq = new HashMap<>();

        // // Step 1: Count occurrences
        // for (int num : arr) {
        // freq.put(num, freq.getOrDefault(num, 0) + 1);
        // }

        // // Step 2: Check uniqueness
        // Set<Integer> occurrences = new HashSet<>(freq.values());
        // return occurrences.size() == freq.size();
        // }

    }

    public static void main(String[] args) {
        lt_1207 sol = new lt_1207();
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        System.out.println(sol.uniqueOccurrences(arr)); // Output: true
    }
}
// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
//         HashMap<Integer, Integer> map = new HashMap<>();
// //        for (int i : arr) {
// //            if (map.containsKey(i)) {
// //                map.put(i, map.get(i) + 1);
// //            } else {
// //                map.put(i, 1);
// //            }
// //        }
//         for(int i : arr) {
//             map.put(i, map.getOrDefault(i,0) + 1);
//         }
        
// //        HashSet<Integer> mapSet = new HashSet<>(map.values());
// //        return map.size() == mapSet.size();

//         HashSet<Integer> set = new HashSet<>();
//         for(int freq : map.values()) {
//             if(!set.add(freq)) return false;
//         }
//         return true;
//     }
// }