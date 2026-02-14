package leetcode;

public class lt_28 {
    public int strStr(String haystack, String needle) {
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        lt_28 sol = new lt_28();
        String haystack = "hello";
        String needle = "ll";
        int result = sol.strStr(haystack, needle);
        System.out.println(result);

    }
}
