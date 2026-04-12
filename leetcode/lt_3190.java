package leetcode;

public class lt_3190 {

    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 3 != 0)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        lt_3190 s = new lt_3190();
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int result = s.minimumOperations(nums); // ✅ directly call the method
        System.out.println(result);
    }
}