package Chapter18;

class Animal {
    void eat() {
        System.out.println("eating...Animal");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("eating...Dog");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog f = new Dog();
        f.eat();  // Calls overridden method in Dog
    }
}