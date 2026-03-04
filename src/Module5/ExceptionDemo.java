package Module5;
import java.io.FileReader;
import java.io.IOException;

    public class ExceptionDemo {
        public static void main(String[] args) {

            // Unchecked Exception
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Unchecked Exception: " + e);
            }

            // Checked Exception
            try {
                FileReader fr = new FileReader("abc.txt");
            } catch (IOException e) {
                System.out.println("Checked Exception: " + e);
            }
        }
    }

