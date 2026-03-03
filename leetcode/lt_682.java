package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lt_682 {
    public int calPoints(String[] operations) {
        List<Integer> arr = new ArrayList<>();

        for (String s : operations) {
            int n = arr.size();
            if (s.equals("+")) {
                arr.add(arr.get(n - 1) + arr.get(n - 2));
            } else if (s.equals("C")) {
                arr.remove(n - 1);
            } else if (s.equals("D")) {
                arr.add(arr.get(n - 1) * 2);
            } else {
                arr.add(Integer.parseInt(s));
            }
        }

        int ans = 0;
        for (int score : arr) {
            ans += score;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] operations = { "5", "2", "C", "D", "+" };
        lt_682 sol = new lt_682();
        int result = sol.calPoints(operations);
        System.out.println(result); // Output: 30
    }
}


    // public int calPoints(String[] operations) {
    //     List<Integer> arr = new ArrayList<>();
    //     int ans = 0; // keep running sum

    //     for (String s : operations) {
    //         int n = arr.size();

    //         if (s.equals("+")) {
    //             int val = arr.get(n - 1) + arr.get(n - 2);
    //             arr.add(val);
    //             ans += val;
    //         } else if (s.equals("C")) {
    //             int removed = arr.remove(n - 1);
    //             ans -= removed;
    //         } else if (s.equals("D")) {
    //             int val = arr.get(n - 1) * 2;
    //             arr.add(val);
    //             ans += val;
    //         } else {
    //             int val = Integer.parseInt(s);
    //             arr.add(val);
    //             ans += val;
    //         }
    //     }

    //     return ans;
    // }