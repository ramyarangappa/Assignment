package Module4;
    class Student {
        int roll;
        String name;
        static String college = "SCE";

        static void changeCollege() {
            college = "New SCE";
        }

        Student(int r, String n) {
            roll = r;
            name = n;
        }

        void display() {
            System.out.println(roll + " " + name + " " + college);
        }
    }

     class StaticDemo {
        public static void main(String[] args) {
            Student.changeCollege();

            Student s1 = new Student(1, "Ram");
            Student s2 = new Student(2, "Shyam");

            s1.display();
            s2.display();
        }
    }


