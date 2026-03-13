package leetcode;

import java.util.Stack;

public class lt_1475 {
    // brute force O(n^2)
    // public int[] finalPrices(int[] prices) {
    // int n = prices.length;
    // int[] ans = new int[n];

    // for (int i = 0; i < n; i++) {
    // ans[i] = prices[i]; // default: no discount
    // for (int j = i + 1; j < n; j++) {
    // if (prices[j] <= prices[i]) {
    // ans[i] = prices[i] - prices[j];
    // break; // stop at the first discount
    // }
    // }
    // }
    // return ans;
    // }

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // While current price is less/equal to stack top, apply discount
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                ans[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
            ans[i] = prices[i]; // default  
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_1475 sol = new lt_1475();
        int[] prices = { 8, 4, 6, 2, 3 };
        int[] result = sol.finalPrices(prices);
        for (int price : result) {
            System.out.print(price + " ");
        }
        // Output: [4, 2, 4, 2, 3]
    }

}
