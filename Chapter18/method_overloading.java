package Chapter18;

public class method_overloading {
    public static void main(String[] args) {
        Calculator cals = new Calculator();
        System.out.println(cals.sum(10, 50));       // calls int version
        System.out.println(cals.sum(10.5f, 50.5f)); // calls float version
    }

    static class Calculator {
        int sum(int a, int b) {
            return a + b;
        }

        float sum(float a, float b) {
            return a + b;
        }
    }
}