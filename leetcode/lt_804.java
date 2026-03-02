package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lt_804 {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                sb.append(morse[ch - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();

    }

    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        lt_804 sol = new lt_804();
        int result = sol.uniqueMorseRepresentations(words);
        System.out.println(result); // Output: 2
    }
}
