package leetcode;

public class lt76 {

    public String minWindow(String s, String t) {

        // If either string is empty, no valid window is possible
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Frequency array to store how many times each character
        // from string t is required
        // ASCII size = 128 (covers all normal English characters)
        int[] freq = new int[128];

        // Fill frequency array using string t
        // Example: t = "ABC"
        // freq['A'] = 1, freq['B'] = 1, freq['C'] = 1
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        // Sliding window pointers
        int left = 0; // start of window
        int right = 0; // end of window

        // Number of characters still needed to make the window valid
        // Initially equal to length of t
        int required = t.length();

        // To store the minimum window length found
        int minLen = Integer.MAX_VALUE;

        // To store the starting index of the minimum window
        int start = 0;

        // Expand the window by moving the right pointer
        while (right < s.length()) {

            // Current character being added to the window
            char r = s.charAt(right);

            // If this character is required (freq > 0),
            // then we reduce the required count
            if (freq[r] > 0) {
                required--;
            }

            // Decrease frequency because this character
            // is now included in the window
            freq[r]--;

            // Move the right pointer forward
            right++;

            // When all required characters are present
            // (i.e., window is valid)
            while (required == 0) {

                // Check if current window is smaller than previous minimum
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                // Character that is going to be removed from the left
                char l = s.charAt(left);

                // Increase frequency since we are removing it from window
                freq[l]++;

                // If frequency becomes positive,
                // it means this character is now missing
                // and the window becomes invalid
                if (freq[l] > 0) {
                    required++;
                }

                // Shrink window from the left
                left++;
            }
        }

        // If no valid window was found, return empty string
        // Otherwise return the smallest window substring
        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        lt76 sol = new lt76();

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = sol.minWindow(s, t);
        System.out.println(result); // Expected output: BANC
    }
}
