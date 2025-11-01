import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Solve ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("All values of x are solutions.");
                else
                    System.out.println("No solution."); 
            } else {
                double x = -c / b;
                System.out.println("Single root: x = " + x);
            }
        } else {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Two real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (D == 0) {
                double x = -b / (2 * a);
                System.out.println("One repeated root:");
                System.out.println("x = " + x);
            } else {
                double rp = -b / (2 * a);
                double ip = Math.sqrt(-D) / (2 * a);
                System.out.println("Two complex roots:");
                System.out.println("x1 = " + rp + " + " + ip + "i");
                System.out.println("x2 = " + rp + " - " + ip + "i");
            }
        }
        sc.close();
    }
}


