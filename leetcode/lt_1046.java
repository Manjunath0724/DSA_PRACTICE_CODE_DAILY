package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class lt_1046 {
    public int lastStoneWeight(int[] stones) {
        // List<Integer> list = new ArrayList<>();
        // for (int stone : stones) {
        //     list.add(stone);
        // }
        // while (list.size() > 1) {
        //     Collections.sort(list);

        //     int y = list.remove(list.size() - 1);
        //     int x = list.remove(list.size() - 1); 

        //     if (y != x) {
        //         list.add(y - x);
        //     }
        // }

        // return list.isEmpty() ? 0 : list.get(0);
        PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());
         for (int stone : stones) {
            maxheap.add(stone);
         }
        while (maxheap.size() > 1) {
    
            int y = maxheap.poll();
            int x = maxheap.poll();
            if (y != x) {
                maxheap.add(y - x); // add the difference back
            }
        }

        return maxheap.isEmpty() ? 0 : maxheap.peek();

    }

    public static void main(String[] args) {
        lt_1046 sol = new lt_1046();
        int[] stones = { 2, 7, 4, 1, 8, 1 };
        System.out.println(sol.lastStoneWeight(stones)); // Output: 1
    }
}
