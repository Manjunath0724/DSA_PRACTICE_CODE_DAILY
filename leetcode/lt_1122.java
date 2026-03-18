package leetcode;

public class lt_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            max = Math.max(arr1[i], max);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;

        }
        int[] ans = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] > 0) {
                ans[index] = arr2[i];
                count[arr2[i]]--;
                index++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ans[index] = i;
                count[i]--;
                index++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_1122 sol = new lt_1122();
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        int[] result = sol.relativeSortArray(arr1, arr2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

// hashmap appraoch 0(n+logn) time complexity and 0(n) space complexity
// // Step 1: Count how many times each number appears in arr1
// Map<Integer, Integer> countMap = new HashMap<>();
// for (int num : arr1) {
// countMap.put(num, countMap.getOrDefault(num, 0) + 1);
// }

// // Step 2: Create a list to store the answer
// List<Integer> result = new ArrayList<>();

// // Step 3: First, add numbers in arr2 order
// for (int num : arr2) {
// int freq = countMap.get(num); // how many times num appears
// for (int i = 0; i < freq; i++) {
// result.add(num);
// }
// countMap.remove(num); // remove so we don’t add again later
// }

// // Step 4: Add the leftover numbers (not in arr2), sorted
// List<Integer> leftovers = new ArrayList<>(countMap.keySet());
// Collections.sort(leftovers);

// for (int num : leftovers) {
// int freq = countMap.get(num);
// for (int i = 0; i < freq; i++) {
// result.add(num);
// }
// }

// // Step 5: Convert list back to array
// int[] ans = new int[result.size()];
// for (int i = 0; i < result.size(); i++) {
// ans[i] = result.get(i);
// }

// return ans;
