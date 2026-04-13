package leetcode;

public class lt_1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        lt_1672 s = new lt_1672();
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        int result = s.maximumWealth(accounts); // ✅ directly call the method
        System.out.println(result);
    }
}
