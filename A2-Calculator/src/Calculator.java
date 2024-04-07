public class Calculator {

    public static double add(double num1, double num2) {
        if (Double.isFinite(num1 + num2)) {
            return num1 + num2;
        } else {
            System.out.println("Error! Addition result exceeds maximum representable value.");
            return Double.NaN;
        }
    }

    public static double subtract(double num1, double num2) {
        if (Double.isFinite(num1 - num2)) {
            return num1 - num2;
        } else {
            System.out.println("Error! Subtraction result exceeds maximum representable value.");
            return Double.NaN;
        }
    }

    public static double multiply(double num1, double num2) {
        if (Double.isFinite(num1 * num2)) {
            return num1 * num2;
        } else {
            System.out.println("Error! Multiplication result exceeds maximum representable value.");
            return Double.NaN;
        }
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            if (Double.isFinite(result)) {
                return result;
            } else {
                System.out.println("Error! Division result exceeds maximum representable value.");
                return Double.NaN;
            }
        } else {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}