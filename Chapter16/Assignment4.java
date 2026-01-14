package Chapter16;

import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        String str = "Hello";
        String Str2 = "lloeh";
        str = str.toLowerCase();
        Str2 = Str2.toLowerCase();
        if (str.length() == Str2.length()) {
            char[] ar1 = str.toCharArray();
            char[] ar2 = Str2.toCharArray();
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            boolean result = Arrays.equals(ar1, ar2);
            if (result) {
                System.out.println("The two strings are anagrams");
            } else {
                System.out.println("The two strings are not anagrams");
            }
        } else {
            System.out.println("The two strings are not anagrams");

        }

    }
}
