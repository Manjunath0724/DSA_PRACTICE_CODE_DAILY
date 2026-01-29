package Chapter19;

public class PrintNumbers {
    public static void printdec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printinc(n - 1);

        System.out.print("\n");
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printdec(10);
        printinc(10);

    }
}
