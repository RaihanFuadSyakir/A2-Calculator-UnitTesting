/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package a2.calculator.unittesting;

public class App {
    public static void main(String[] args) {
        System.out.println("Aplikasi Kalkulator A2!");

        String num1 = InputHandler.scanLine("Masukkan operand: ");
        String num2 = InputHandler.scanLine("Masukkan operand: ");
        System.out.println("Pilihan Operasi angka :");
        System.out.println("+ (Penjumlahan)");
        System.out.println("- (Pengurangan)");
        System.out.println("* (Perkalian)");
        System.out.println("/ (Pembagian)");
        String choice = InputHandler.scanLine("");
        boolean isInputsValid = ValidationValue.validateInputs(num1, num2, choice);
        if (isInputsValid) {
            double converted_num1 = Double.parseDouble(num1);
            double converted_num2 = Double.parseDouble(num2);
            double result = getResult(converted_num1, converted_num2, choice);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Operasi hitung gagal");
        }

    }

    private static double getResult(double num1, double num2, String choice) {
        double result = 0;
        switch (choice) {
            case "+":
                result = Calculator.add(num1, num2);
                break;
            case "-":
                result = Calculator.subtract(num1, num2);
                break;
            case "*":
                result = Calculator.multiply(num1, num2);
                break;
            case "/":
                result = Calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Error! Operasi yang dipilih tidak ada.");
                result = Double.NaN;
        }
        return result;
    }

}
