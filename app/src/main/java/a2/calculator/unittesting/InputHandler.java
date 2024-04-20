package a2.calculator.unittesting;

import java.util.Scanner;

public class InputHandler {
    public static String scanLine(String message) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a line of input
        System.out.println(message);
        // Read the entire line of input
        String line = scanner.nextLine();
        // Close the Scanner object to prevent resource leak
        scanner.close();
        // Return the scanned line
        return line;
    }
}
