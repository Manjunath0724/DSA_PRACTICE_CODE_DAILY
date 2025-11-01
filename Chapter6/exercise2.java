package Chapter6;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side for square : ");
        int side= sc.nextInt();
        int area = side * side  ;
        System.out.println(area);
    }
}
