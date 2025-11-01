package Chapter6;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a Pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Enter the Value of a Pen :");
        float pen = sc.nextFloat();
        System.out.println("Enter the Value of a Eraser :");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float gst = total * 0.18f;

        // float bill = total + (0.18f * total);
        float bill = total+gst;

        System.out.println(bill);

        sc.close();

    }
}
