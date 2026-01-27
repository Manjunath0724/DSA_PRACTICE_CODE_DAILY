package Chapter18;

public class inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}
    class animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("Breathes");
        }
    }

    class fish extends animal {
        int fins;

        void swim() {
            System.out.println("swims in water");
        }
    }

