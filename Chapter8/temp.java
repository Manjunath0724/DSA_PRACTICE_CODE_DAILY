package Chapter8;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("Have Fever");
        } else {
            System.out.println("Y0u dont have fever");
        }
        sc.close();
    }
}
