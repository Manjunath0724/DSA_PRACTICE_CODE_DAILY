package Chapter18;

public class ConstructorExample {
    // Student class with copy constructor
    static class Student {
        String name;
        int roll;
        String password;

        // Default constructor
        Student() {
            System.out.println("Default Constructor called");
        }

        // Parameterized constructor
        Student(String name, int roll, String password) {
            this.name = name;
            this.roll = roll;
            this.password = password;
        }

        // Copy constructor
        Student(Student s) {
            this.name = s.name;
            this.roll = s.roll;
            this.password = s.password;
            System.out.println("Copy Constructor called");
        }
    }

    public static void main(String[] args) {
        // Create first student using parameterized constructor
        Student s1 = new Student("Ravi", 11, "abcd");

        // Create second student using copy constructor
        Student s2 = new Student(s1);

        // Print values to verify
        System.out.println("s1: " + s1.name + ", " + s1.roll + ", " + s1.password);
        System.out.println("s2: " + s2.name + ", " + s2.roll + ", " + s2.password);
    }
}