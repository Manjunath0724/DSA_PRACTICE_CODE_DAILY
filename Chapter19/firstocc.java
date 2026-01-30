package Chapter19;

public class firstocc {
    public static int first_occurence(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        return first_occurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        System.out.println("Element found at index:" + first_occurence(arr, key, 0));
    }
}
