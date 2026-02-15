package leetcode;

public class lt_1186 {
    public int maximumSum(int[] nums) {
        int nodelete = nums[0];
        int onedelete = Integer.MIN_VALUE;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;

            nodelete = Math.max(prevnodelete + nums[i], nums[i]);
            int v2;
            if (prevonedelete == Integer.MIN_VALUE) {
                v2 = prevnodelete;
            } else {
                v2 = prevonedelete + nums[i];
            }
            onedelete = Math.max(v2, prevnodelete);
            res = Math.max(res, Math.max(nodelete, onedelete));
        }
        return res;
    }

    public static void main(String[] args) {
        lt_1186 lt = new lt_1186();
        int[] nums = { 1, -2, 0, 3 };
        System.out.println(lt.maximumSum(nums));
    }
}

// consice version
// public int maximumSum(int[] nums) {
// int nodelete = nums[0], onedelete = Integer.MIN_VALUE, res = nums[0];
// for (int i = 1; i < nums.length; i++) {
// // update onedelete carefully
// if (onedelete == Integer.MIN_VALUE) {
// onedelete = nodelete; // delete current element
// } else {
// onedelete = Math.max(onedelete + nums[i], nodelete);
// }
// nodelete = Math.max(nodelete + nums[i], nums[i]);
// res = Math.max(res, Math.max(nodelete, onedelete));
// }
// return res;
// }'
// '

//  forward -backward kadane 
// public int maximumSum(int[] nums) {
//     int n = nums.length;
//     int[] forward = new int[n];
//     int[] backward = new int[n];

//     // Forward Kadane: max subarray sum ending at i
//     forward[0] = nums[0];
//     int res = nums[0];
//     for (int i = 1; i < n; i++) {
//         forward[i] = Math.max(nums[i], forward[i - 1] + nums[i]);
//         res = Math.max(res, forward[i]);
//     }

//     // Backward Kadane: max subarray sum starting at i
//     backward[n - 1] = nums[n - 1];
//     for (int i = n - 2; i >= 0; i--) {
//         backward[i] = Math.max(nums[i], backward[i + 1] + nums[i]);
//     }

//     // Try deleting one element
//     for (int i = 1; i < n - 1; i++) {
//         res = Math.max(res, forward[i - 1] + backward[i + 1]);
//     }

//     return res;
// }


// - Approach 1 (two variables with prevnodelete/onedelete):
// This version only uses a handful of scalar variables (nodelete, onedelete, res, and a couple of temporaries). The memory usage does not depend on the size of the input array.
// → Space complexity: O(1) (constant space).
// - Approach 2 (compact iterative with condition):
// This is essentially the same as Approach 1 but written more concisely. It also only keeps a few scalar variables and no extra arrays.
// → Space complexity: O(1) (constant space).
// - Approach 3 (forward/backward Kadane):
// This version explicitly builds two arrays of size n (forward[] and backward[]) to store intermediate results. That means the extra memory grows linearly with the input size.
// → Space complexity: O(n) (linear space).
