package Chapter8;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a Calculator ");
        System.out.println("1 : Addition \n2 : Subtraction\n3 : Mulitiplication\n4 : Division\n5 : Modulus");
        System.out.println("Enter Your Choice :......");
        int input = sc.nextInt();
        float a, b;
        switch (input) {
            case 1:
                System.out.println("Enter Number 1:");
                a = sc.nextInt();
                System.out.println("Enter Number 2:");
                b = sc.nextInt();
                float sum = a + b;
                System.out.println(sum);
                break;
            case 2:
                System.out.println("Enter Number 1:");
                a = sc.nextInt();
                System.out.println("Enter Number 2:");
                b = sc.nextInt();
                float sub = a - b;
                System.out.println(sub);
                break;
            case 3:
                System.out.println("Enter Number 1:");
                a = sc.nextInt();
                System.out.println("Enter Number 2:");
                b = sc.nextInt();
                float mul = a * b;
                System.out.println(mul);
                break;
            case 4:
                System.out.println("Enter Number 1:");
                a = sc.nextInt();
                System.out.println("Enter Number 2:");
                b = sc.nextInt();
                float div = a / b;
                System.out.println(div);
                break;
            case 5:
                System.out.println("Enter Number 1:");
                a = sc.nextInt();
                System.out.println("Enter Number 2:");
                b = sc.nextInt();
                float mod = a % b;
                System.out.println(mod);
                break;

            default:
                System.out.println("Wrong input !");

        }
    }
}
