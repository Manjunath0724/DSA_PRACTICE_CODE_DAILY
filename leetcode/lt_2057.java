package leetcode;

public class lt_2057 {

    public int smallestEqual(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i % 10 == nums[i])
                return i;
        }
        return -1;

    }

public static void main(String[] args) {
    lt_2057 s = new lt_2057();
    int[] nums = {0,1,2};
    int result = s.smallestEqual(nums);
    System.out.println(result); // Output: 0
}
