package Chapter10_11;

import java.util.Scanner;

public class sumofdigit {

    public static void sumofd(int num){
        
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        System.out.print(sum);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        sumofd(num);


    }
}