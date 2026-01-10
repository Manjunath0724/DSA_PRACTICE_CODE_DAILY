package Chapter14;

public class assignment {
    public static void sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swaps = 0;
            for (int i = 0; i < arr.length - 1 - turn; i++) {
                if (arr[i] < arr[i + 1]) {
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

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // store the value, not index
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev]; // shift
                prev--;
            }

            arr[prev + 1] = curr; // insert
        }
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;

                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("Sorting in descending order:Bubble Sort");
        sort(arr);
        printsort(arr);
        System.out.println();
        System.out.println("Sorting in descending order:Insertion Sort");
        insertionSort(arr);
        printsort(arr);
        System.out.println();
        System.out.println("Sorting in descending order:Selection Sort");
        SelectionSort(arr);
        printsort(arr);
        System.out.println();
        System.out.println("Sorting in descending order:Counting Sort");
        Countingsort(arr);
        printsort(arr);
    }
}
