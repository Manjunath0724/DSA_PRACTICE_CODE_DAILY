package Chapter13;

// public class pivotsolution {

//     // Helper function: Find the index of the smallest element (pivot)
//     public static int findPivot(int[] nums) {
//         int left = 0, right = nums.length - 1;
//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] > nums[right]) {
//                 left = mid + 1;
//             } else {
//                 right = mid;
//             }
//         }
//         return left; // Pivot index (smallest element)
//     }

//     // Helper function: Binary search, left and right are inclusive
//     public static int binarySearch(int[] nums, int left, int right, int target) {
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         return -1;
//     }

//     // Main function
//     public static int search(int[] nums, int target) {
//         int n = nums.length;
//         if (n == 0) return -1;
//         int pivot = findPivot(nums);

//         if (nums[pivot] <= target && target <= nums[n - 1]) {
//             // Target is in the right sorted part
//             return binarySearch(nums, pivot, n - 1, target);
//         } else {
//             // Target is in the left sorted part
//             return binarySearch(nums, 0, pivot - 1, target);
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {4,5,6,7,0,1,2};
//         int target = 0;
//         int index = search(nums, target);
//         System.out.println("Index of target: " + index);
//     }
// }


public class pivotsolution {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target lies in left sorted section
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 2;
        int index = search(nums, target);
        System.out.println("Index of target: " + index);
    }
}
