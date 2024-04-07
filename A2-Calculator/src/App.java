import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator!");

        double num1 = getInput(scanner, "Enter the first number: ");
        double num2 = getInput(scanner, "Enter the second number: ");
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = getOperationChoice(scanner);

        double result = getResult(num1, num2, choice);
        scanner.close();

        System.out.println("Result: " + result);

    }

    private static double getResult(double num1, double num2, int choice) {
        double result = 0;
        switch (choice) {
            case 1:
                result = Calculator.add(num1, num2);
                break;
            case 2:
                result = Calculator.subtract(num1, num2);
                break;
            case 3:
                result = Calculator.multiply(num1, num2);
                break;
            case 4:
                result = Calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                result = Double.NaN;
        }
        return result;
    }

    private static double getInput(Scanner scanner, String message) {
        double input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                input = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
        return input;
    }

    private static int getOperationChoice(Scanner scanner) {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice! Please select a valid operation.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
        return choice;
    }
}
