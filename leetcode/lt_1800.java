package leetcode;

public class lt_1800 {

    public int maxAscendingSum(int[] nums) {
        int curr = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = nums[i] > nums[i - 1] ? curr + nums[i] : nums[i];
            ans = Math.max(ans, curr);
        }
        return ans;

    }

    public static void main(String[] args) {
        lt_1800 lt = new lt_1800();
        System.out.println(lt.maxAscendingSum(new int[] { 10, 20, 30, 5, 10, 50 }));
        System.out.println(lt.maxAscendingSum(new int[] { 10, 20, 30, 40, 50 }));
        System.out.println(lt.maxAscendingSum(new int[] { 12, 17, 15, 13, 10, 11, 12 }));
    }
}
