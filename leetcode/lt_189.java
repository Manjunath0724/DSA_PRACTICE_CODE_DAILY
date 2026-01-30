package leetcode;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle cases where k > n


        reverse(nums, 0, n - 1);

        reverse(nums, n-k+1, n-1);

        reverse(nums, 0, n - k);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

public class lt_189 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        sol.rotate(nums, k);

        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
// joggling algorithm
// public void rotateCycle(int[] nums, int k) {
//     int n = nums.length;
//     k = k % n;
//     int count = 0; // number of elements moved

//     for (int start = 0; count < n; start++) {
//         int current = start;
//         int prev = nums[start];

//         do {
//             int next = (current + k) % n;
//             int temp = nums[next];
//             nums[next] = prev;
//             prev = temp;
//             current = next;
//             count++;
//         } while (start != current);
//     }
// }
