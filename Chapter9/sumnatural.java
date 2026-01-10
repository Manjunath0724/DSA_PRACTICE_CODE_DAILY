package Chapter9;

import java.util.Scanner;

public class sumnatural {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 1;
        while (i <= input) {
            sum += i;
            i++;
        }
        System.out.println("Sum of the n natural numbers is :" + sum);
    }
}
