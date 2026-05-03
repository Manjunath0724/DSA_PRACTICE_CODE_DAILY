package leetcode;

public class lt_2073 {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        lt_2073 s = new lt_2073();
        int[] tickets = { 2, 3, 2 };
        int k = 2;
        int result = s.timeRequiredToBuy(tickets, k);
        System.out.println(result); // Output: 6
    }
}
