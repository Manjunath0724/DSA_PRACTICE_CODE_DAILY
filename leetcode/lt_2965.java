package leetcode;

class lt_2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n * n];
        int index = 0;
        int size = n * n;
        // // flatten the gird array to normal long array
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         arr[index++] = grid[i][j];
        //     }
        // }
        // calculate the freqq of each element
        int[] freq = new int[size + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }
        // checking and returning the repeated and missing element
        int duplicate = -1;
        int missing = -1;

        for (int num = 1; num <= size; num++) {
            if (freq[num] == 2) {
                duplicate = num;
            } else if (freq[num] == 0) {
                missing = num;
            }
        }
        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        lt_2965 obj = new lt_2965();
        int[][] grid = { { 1, 2 }, { 2, 4 } };
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}


//
// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
//         int n = grid.length;
//         boolean[] attendance = new boolean[n * n + 1];
//         int duplicate = -1;

//         // Mark occurrences in attendance array
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (attendance[grid[i][j]]) {
//                     duplicate = grid[i][j];
//                 } else {
//                     attendance[grid[i][j]] = true;
//                 }
//             }
//         }

//         // Find the missing number
//         for (int i = 1; i <= n * n; i++) {
//             if (!attendance[i]) return new int[]{duplicate, i};
//         }
//         return new int[]{};
//     }
// }
