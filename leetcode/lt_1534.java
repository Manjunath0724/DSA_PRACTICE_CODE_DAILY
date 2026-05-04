package leetcode;

public class lt_1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int goodTriplets = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b &&
                                Math.abs(arr[i] - arr[k]) <= c) {
                            goodTriplets++;
                            // 🥋 Rock Lee: "Training pays off—one combo at a time!" 💥
                        }
                    }
                }
            }
        }

        return goodTriplets;

    }

    public static void main(String[] args) {
        lt_1534 s = new lt_1534();
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        int a = 7;
        int b = 2;
        int c = 3;
        int result = s.countGoodTriplets(arr, a, b, c);
        System.out.println(result); // Output: 4F
    }
}
