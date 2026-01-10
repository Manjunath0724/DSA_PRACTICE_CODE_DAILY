package Chapter9;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Table:");
        int number = sc.nextInt();
        System.out.println("Table of Number:" + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        sc.close();
    }
}
