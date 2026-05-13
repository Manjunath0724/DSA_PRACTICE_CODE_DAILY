package leetcode;

public class lt_1720 {

    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        for (int i = 0; i < encoded.length; i++)
            res[i + 1] = res[i] ^ encoded[i];
        return res;

    }

public static void main(String[] args) {
        lt_1720 s = new lt_1720();
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] result = s.decode(encoded, first);
        System.out.println(java.util.Arrays.toString(result)); // Output: [1, 0, 2, 1]
}
