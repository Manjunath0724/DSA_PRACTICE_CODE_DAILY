package Chapter19;

public class assign1 {
    public static void printcount(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i + "");
        }
        printcount(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 2, 2, 4, 6, 7, 8, 9, 1, 3, 5, 6, 9, 8, 9 };
        int key = 9;
        printcount(arr, key, 0);
        System.out.println();
    }
}
