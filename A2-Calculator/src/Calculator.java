public class Calculator {

    public static double add(double num1, double num2) {
        if (Double.isFinite(num1 + num2)) {
            return num1 + num2;
        } else {
            System.out.println("Error! Penjumlahan melebihi batas nilai yang dapat ditampung");
            return Double.NaN;
        }
    }

    public static double subtract(double num1, double num2) {
        if (Double.isFinite(num1 - num2)) {
            return num1 - num2;
        } else {
            System.out.println("Error! Penjumlahan melebihi batas nilai yang dapat ditampung");
            return Double.NaN;
        }
    }

    public static double multiply(double num1, double num2) {
        if (Double.isFinite(num1 * num2)) {
            return num1 * num2;
        } else {
            System.out.println("Error! Penjumlahan melebihi batas nilai yang dapat ditampung");
            return Double.NaN;
        }
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            if (Double.isFinite(result)) {
                return result;
            } else {
                System.out.println("Error! Penjumlahan melebihi batas nilai yang dapat ditampung");
                return Double.NaN;
            }
        } else {
            System.out.println("Error! Pembagian oleh 0 tidak diperbolehkan.");
            return Double.NaN;
        }
    }
}