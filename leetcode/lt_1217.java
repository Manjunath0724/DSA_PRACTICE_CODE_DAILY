package leetcode;

public class lt_1217 {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int min = Math.min(odd, even);
        return min;
    }

    public static void main(String[] args) {
        lt_1217 sol = new lt_1217();
        int[] position = { 1, 2, 3 };
        int result = sol.minCostToMoveChips(position);
        System.out.println(result); // Output: 1

    }
}
