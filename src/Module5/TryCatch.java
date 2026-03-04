package Module5;
import java.util.Scanner;

public class TryCatch {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("Enter two numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();

                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            } finally {
                System.out.println("Program Finished");
            }
        }
    }

