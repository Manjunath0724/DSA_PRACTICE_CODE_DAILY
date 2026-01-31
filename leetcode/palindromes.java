package leetcode;

public class palindromes {
    public boolean isPalindrome(int x) {
        // Negative numbers or numbers ending with 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Reverse only half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // For even length: x == reversedHalf
        // For odd length: x == reversedHalf / 10 (middle digit ignored)
        return x == reversedHalf || x == reversedHalf / 10;
    }

    // Quick test
    public static void main(String[] args) {
        palindromes sol = new palindromes();

        System.out.println(sol.isPalindrome(121));    // true
        System.out.println(sol.isPalindrome(-121));   // false
        System.out.println(sol.isPalindrome(10));     // false
        System.out.println(sol.isPalindrome(1221));   // true
        System.out.println(sol.isPalindrome(12321));  // true
        System.out.println(sol.isPalindrome(1234));   // false
    }
}
