package Chapter8;

import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax = 0;

        if (income < 500000) {
            System.out.println("Zero tax !");
        } else if (income >= 500000 && income < 1000000) {
            tax = 0.2f * income;
            System.out.println("Your Tax :");
            System.out.println(tax);
        } else if (income > 1000000) {
            tax = 0.3f * income;
            System.out.println("Your Tax :");
            System.out.println(tax);
        } else {
            System.out.println("Enter valid input !");
        }
    }
}
