package Chapter13;

import java.util.*;

public class Binary {

    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 101;

        int index = BinarySearch(numbers, key);
        if (index == -1) {
            System.out.println("The Element is not found");
        } else {
            System.out.println("The Element is found at the index :" + index);
        }
    }
}
