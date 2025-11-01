package Chapter8;

public class ternary {
    public static void main(String[] args) {
        int number = 5;
        String type = ((number % 2) == 0 ? "Even" : "Odd");
        System.out.println(type);
    }
}
