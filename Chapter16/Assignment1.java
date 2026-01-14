package Chapter16;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        StringBuilder sd = new StringBuilder(input);
        int count = 0;
        for (int i = 0; i < sd.length(); i++) {
            char ch = sd.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the given string: " + count);
    }
}
