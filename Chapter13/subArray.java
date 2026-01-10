package Chapter13;

import java.util.*;

public class subArray {

    public static void subArrayGroup(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("=> Sum: " + sum);

                // Update max and min
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                ts++;
            }
            System.out.println();
        }

        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
    }

    public static void prefixArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // System.out.println(currSum);
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(" Max sum :" + maxSum);

    }

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.println("Our max element from the subarray is :" + ms);
    }

    public static void kadanesAllNegative(int numbers[]) {
        int maxNegative = Integer.MIN_VALUE;
        int minNegative = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // Track the largest negative (Kadane's fallback)
            if (numbers[i] > maxNegative) {
                maxNegative = numbers[i];
            }

            // Track the smallest negative
            if (numbers[i] < minNegative) {
                minNegative = numbers[i];
            }
        }

        System.out.println("All elements are negative.");
        System.out.println("Maximum subarray sum (least negative): " + maxNegative);
        System.out.println("Smallest negative number in the array: " + minNegative);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int numbers2[] = { 1, -2, 6, -1, 3 };
        subArrayGroup(numbers);
        prefixArray(numbers2);
        int numbers3[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(numbers3);
        int numbers4[] = { -5, -3, -6, -2, -8, -4 };
        kadanesAllNegative(numbers4);

    }
}
