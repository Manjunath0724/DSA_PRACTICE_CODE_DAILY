package Chapter20;

public class modifiedbinaryleetcode {
    public static int binarySearch(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            // left
            if (target >= arr[si] && target <= arr[mid]) {
                return binarySearch(arr, target, si, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, ei);
            }
        } else {
            // right
            if (target >= arr[mid] && target <= arr[ei]) {
                return binarySearch(arr, target, mid + 1, ei);
            } else {
                return binarySearch(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 5;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }
}
