package Chapter19;

public class lastocc {
    public static int last_occurence(int arr[], int key, int i) {
        // Base case: if we reach end of array
        if (i == arr.length) {
            return -1;
        }

        // Recursive call for rest of array
        int isFound = last_occurence(arr, key, i + 1);

        // If found later, return that index
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        System.out.println("Last occurrence of element is at index: "
                + last_occurence(arr, key, 0));
    }
}