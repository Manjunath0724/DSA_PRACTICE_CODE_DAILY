package leetcode;

import java.util.Arrays;

public class lt_1313 {

    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int size = 0;
        for (int i = 0; i < n; i += 2)
            size += nums[i];
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < n; i += 2) {
            Arrays.fill(arr, index, index + nums[i], nums[i + 1]);
            index += nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        lt_1313 s = new lt_1313();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = s.decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }
}
