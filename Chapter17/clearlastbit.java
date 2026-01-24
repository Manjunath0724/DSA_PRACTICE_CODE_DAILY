package Chapter17;

public class clearlastbit {
    public static int clearlastbitfunc(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearlastbitfunc(15, 2));
    }
}