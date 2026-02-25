package Module2;

public class Student {
        String name;
        int age;

        // Default Constructor
        Student() {
            name = "Unknown";
            age = 0;
        }

        // Parameterized Constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

     class ConstructorDemo {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Ramya", 20);

            s1.display();
            s2.display();
        }
    }

