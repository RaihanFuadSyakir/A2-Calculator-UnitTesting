/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package a2.calculator.unittesting;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aplikasi Kalkulator A2!");

        double num1 = getInput(scanner, "Masukkan angka pertama: ");
        double num2 = getInput(scanner, "Masukkan angka kedua: ");
        System.out.println("Pilihan Operasi angka :");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

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
                System.out.println("Error! Operasi yang dipilih tidak ada.");
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
                System.out.println("Error! Input tidak valid, tolong masukkan input angka");
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
                System.out.print("Masukkan pilihan operasi: ");
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    validInput = true;
                } else {
                    System.out.println("Error! Operasi yang dipilih tidak ada.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Input tidak valid, tolong masukkan input angka.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
        return choice;
    }
}
