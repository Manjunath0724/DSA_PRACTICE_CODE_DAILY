package Chapter17;

public class updatebit {
    public static int updatebitfunc(int n, int i, int newbit) {
        n = clearbit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static int clearbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(updatebitfunc(10, 2, 1));
    }
}
