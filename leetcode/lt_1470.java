package leetcode;

// LeetCode 1470: Shuffle the Array
class lt_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int i = 0, j = n, k = 0;

        while (i < n && j < 2 * n) {
            result[k++] = nums[i++];
            result[k++] = nums[j++];
        }

        return result;
    }

    // Main method to test the shuffle function
    public static void main(String[] args) {
        lt_1470 obj = new lt_1470();

        // Example 1
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] result1 = obj.shuffle(nums1, n1);
        System.out.print("Output 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 2
        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] result2 = obj.shuffle(nums2, n2);
        System.out.print("Output 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example 3
        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        int[] result3 = obj.shuffle(nums3, n3);
        System.out.print("Output 3: ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}