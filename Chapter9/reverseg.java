package Chapter9;

public class reverseg {
    public static void main(String[] args) {
        int number = 23454;
        int rev = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            rev = (rev * 10) + lastdigit;
            number = number / 10;

        }
        System.out.println(rev);
    }
}
