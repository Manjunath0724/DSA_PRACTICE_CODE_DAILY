package leetcode;

public class lt_1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int result = 0;
        for (int[] d : dominoes) {
            int val1 = d[0];
            int val2 = d[1];

            int key = Math.min(val1, val2) * 10 + Math.max(val1, val2);
            result += count[key];
            count[key]++;
        }
        return result;

    }

    public static void main(String[] args) {
        lt_1128 sol = new lt_1128();
        int[][] dominoes = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } };
        int result = sol.numEquivDominoPairs(dominoes);
        System.out.println(result); // Output: 1
    }
}

// Intuition
// - count tracks occurrences of each domino type.
// - result accumulates the number of pairs formed as new dominoes arrive.
// So:
// - count = "How many of this domino have I seen?"
// - result = "How many pairs have been formed so far?"
