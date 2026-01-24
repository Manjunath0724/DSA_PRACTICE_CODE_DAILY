package Chapter17;

public class oddeven {
    public static void oddevenfunc(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        oddevenfunc(45);
        oddevenfunc(4);
    }
}
