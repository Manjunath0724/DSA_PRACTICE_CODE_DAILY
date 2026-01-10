package Chapter9;

import java.util.Scanner;

public class onetoten {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (i <= input) {
            System.out.println(i);
            i++;
        }
    }
}
