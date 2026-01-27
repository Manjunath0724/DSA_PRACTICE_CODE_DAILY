package leetcode;

public class LT_709 {
    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Add 32 to convert uppercase ASCII to lowercase
                chars[i] = (char) (chars[i] + 32);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello")); // hello
        System.out.println(toLowerCase("here")); // here
        System.out.println(toLowerCase("LOVELY")); // lovely
    }
}
