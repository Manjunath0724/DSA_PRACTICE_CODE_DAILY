package leetcode;

public class lt_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int currentsize = 0;

        for (int i = 0; i < nums.length; i++) {
            if (index[i] < currentsize) {
                for (int j = currentsize - 1; j >= index[i]; j--) {
                    target[j + 1] = target[j];
                }
            }
            target[index[i]] = nums[i];
            currentsize++;
        }

        return target;
    }

    public static void main(String[] args) {
        lt_1389 s = new lt_1389();
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] result = s.createTargetArray(nums, index);
        System.out.println(java.util.Arrays.toString(result)); // Output: [0, 4, 1, 3, 2]
    }
}
