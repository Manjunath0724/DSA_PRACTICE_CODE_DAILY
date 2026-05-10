package leetcode;

public class lt_1732 {

    public int largestAltitude(int[] gain) {
        int maxAlt = 0; // start altitude is 0
        int current = 0;

        for (int g : gain) {
            current += g;
            maxAlt = Math.max(maxAlt, current);
        }

        return maxAlt;

    }

    public static void main(String[] args) {
        lt_1732 s = new lt_1732();
        int[] gain = { -5, 1, 5, 0, -7 };
        int result = s.largestAltitude(gain);
        System.out.println(result); // Output: 1
    }
}
