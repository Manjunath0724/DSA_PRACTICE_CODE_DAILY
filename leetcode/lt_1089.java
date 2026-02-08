package leetcode;

public class lt_1089 {
    public void duplicateZeros(int[] arr) {
        int z = 0;// count zeros to append
        for (int i : arr) {
            if (i == 0) {
                z++;
            }
        }
        // take the i pointer to end of the arr and j to the conceptual array means
        // increasing the array size by the zeros to include
        int i = arr.length - 1, j = arr.length + z - 1;
        // to run this loop until the i & j value are not same
        while (i != j) {
            insert(arr, i, j);// first to exhcange the value one time
            j--;// decrement the value of j first because we have to atleast change or shift the
                // value once
            if (arr[i] == 0) {// if the i will be 0 then the zeros will be exchanged the values two times
                insert(arr, i, j);
                j--;
            }
            i--;// after changing two time then decrement the value of i and also if not the
                // value of i is 0 then also decremnt the value
        }
    }

    private void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }

    public static void main(String[] args) {
        lt_1089 sol = new lt_1089();
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        sol.duplicateZeros(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

// Setup
// - Length = 7
// - Zeros = 2
// - Conceptual size = 9 → j = 8
// - Start: i = 6

// Iteration log
// - i=6, j=8 → arr[6]=4 → j out of bounds → no change
// Array: [2,0,9,1,0,2,4]
// - i=5, j=7 → arr[5]=2 → arr[7]=2
// Array: [2,0,9,1,0,2,2]
// - i=4, j=6 → arr[4]=0 → arr[6]=0, arr[5]=0
// Array: [2,0,9,1,0,0,0]
// - i=3, j=4 → arr[3]=1 → arr[4]=1
// Array: [2,0,9,1,1,0,0]
// - i=2, j=3 → arr[2]=9 → arr[3]=9
// Array: [2,0,9,9,1,0,0]
// - i=1, j=2 → arr[1]=0 → arr[2]=0, arr[1]=0
// Array: [2,0,0,9,1,0,0]
// - i=0, j=0 → loop ends.

// Final Result
// [2,0,0,9,1,0,0]


