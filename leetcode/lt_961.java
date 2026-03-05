package leetcode;

class lt_961 {
    public int repeatedNTimes(int[] nums) {
        // int n = nums.length / 2;
        // for (int i = 0; i < n; i++) {
        // if (nums[i] == nums[i + n]) {
        // return nums[i];
        // }
        // }
        // return nums[nums.length-1]; // This line should never be reached since the
        // problem guarantees

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) {
                return nums[i];
            }
        }
        return nums[n - 1];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        lt_961 sol = new lt_961();
        int result = sol.repeatedNTimes(nums);
        System.out.println(result); // Output: 3
    }
}