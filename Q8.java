// Q8) WAJP that reads two integers and display their division. Handle Arithmetic Exception.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the first integer
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Read the second integer
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;

            // Display the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
