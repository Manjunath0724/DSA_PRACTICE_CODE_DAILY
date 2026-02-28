package leetcode;

public class lt_268 {
    public int missingNumber(int[] nums) {
        // formaula appraoch
        // int n = nums.length;

        // // Expected sum of numbers from 0 to n
        // int expectedSum = n * (n + 1) / 2;

        // // Actual sum of given array
        // int actualSum = 0;
        // for (int num : nums) {
        // actualSum += num;
        // }

        // // Missing number is the difference
        // return expectedSum - actualSum;

        // xor appraoch
        int n = nums.length;
        int xorAll = 0;
        int xorNums = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR all numbers in the array
        for (int num : nums) {
            xorNums ^= num;
        }

        // Missing number is xorAll ^ xorNums
        return xorAll ^ xorNums;

    }

    // Example usage
    public static void main(String[] args) {
        lt_268 obj = new lt_268();
        System.out.println(obj.missingNumber(new int[] { 3, 0, 1 })); // Output: 2
        System.out.println(obj.missingNumber(new int[] { 0, 1 })); // Output: 2
        System.out.println(obj.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 })); // Output: 8
    }

}

// my logic of the code------------------>
// public int missingNumber(int[] nums) {
// int n = nums.length;
// boolean[] seen = new boolean[n + 1]; // range [0..n]

// // Mark appearances
// for (int num : nums) {
// seen[num] = true;
// }

// // Find the index that is still false
// for (int i = 0; i <= n; i++) {
// if (!seen[i]) {
// return i;
// }
// }

// return -1; // should never happen
// }
