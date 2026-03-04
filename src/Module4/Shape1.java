package Module4;

    abstract class Shape1 {
        abstract double area();
    }

    class Circle extends Shape1 {
        double radius;

        Circle(double r) {
            radius = r;
        }

        double area() {
            return 3.14 * radius * radius;
        }
    }

    class Rectangle extends Shape1 {
        double length, width;

        Rectangle(double l, double w) {
            length = l;
            width = w;
        }

        double area() {
            return length * width;
        }
    }

    class TestShape {
        public static void main(String[] args) {
            Shape1 c = new Circle(5);
            Shape1 r = new Rectangle(4, 6);

            System.out.println("Circle Area: " + c.area());
            System.out.println("Rectangle Area: " + r.area());
        }
    }

