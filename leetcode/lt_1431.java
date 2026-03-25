package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lt_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        boolean[] arr = new boolean[n];
        for (int num : candies) {
            max = Math.max(max, num);
        }
        for (int i = 0; i < n; i++) {
            int add = candies[i] + extraCandies;
            // if(add>=max){
            // arr[i]=true;
            // }else{
            // arr[i]=false;
            // }
            arr[i] = (add >= max);
        }
        List<Boolean> result = new ArrayList<>();
        for (boolean b : arr) {
            result.add(b); // autoboxes boolean to Boolean
        }
        return result;
    }

    public static void main(String[] args) {
        lt_1431 sol = new lt_1431();
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> result = sol.kidsWithCandies(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
    }
}
