package leetcode;

public class lt_1512 {
    public int numIdenticalPairs(int[] A) {
        int ans = 0, cnt[] = new int[101];
        for (int a : A) {
            ans += cnt[a]++;
        }
        return ans;

    }

    public static void main(String[] args) {
        lt_1512 s = new lt_1512();
        int[] A = { 1, 2, 3, 1, 1, 3 };
        int result = s.numIdenticalPairs(A);
        System.out.println(result); // Output: 4
    }
}
