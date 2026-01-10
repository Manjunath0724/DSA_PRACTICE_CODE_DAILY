package Chapter14;

public class bubble1 {
    public static void sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swaps = 0;
            for (int i = 0; i < arr.length - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }

    public static void printsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        // int arr[] = { 4, 2, 3, 5, 1 };
        int arr[] = { 1, 2, 3, 4, 5 };
        sort(arr);
        printsort(arr);
    }
}
