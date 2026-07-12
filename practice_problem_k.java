import java.util.Scanner;

public class practice_problem_k {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scan.nextInt();

        System.out.print("Enter second integer: ");
        int b = scan.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = scan.next().charAt(0);

        int result = 0;
        boolean valid = true;

        if (ch == '+') {
            result = a + b;
        } else if (ch == '-') {
            result = a - b;
        } else if (ch == '*') {
            result = a * b;
        } else if (ch == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                valid = false;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        scan.close();
    }
}
