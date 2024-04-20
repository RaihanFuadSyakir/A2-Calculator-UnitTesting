package a2.calculator.unittesting;

public class ValidationValue {
    public static boolean isNumber(String strNum) {
        double d = 0;
        if (strNum == null) {
            System.out.println("input kosong, tolong masukkan angka yang benar");
            return false;
        }
        try {
            d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            System.out.println("input bukan merupakan angka, tolong masukkan angka yang benar");
            return false;
        }
        return true;
    }

    public static boolean isOperator(String str) {
        // Check if the string is one of the basic arithmetic operators
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return true;
        }
        System.out.println("input operator tidak benar, tolong input karakter +,-,*,/");
        return false;
    }

    public static boolean isWithinRange(double number) {
        // Check if the number falls within the specified range
        if (number >= -32768.0 && number <= 32767.0) {
            return true;
        }
        System.out.println("angka : " + number + " tidak berada pada jangka yaitu -32,768 sampai 32,767");
        System.out.println("tolong masukkan angka pada jangka -32,768 sampai 32,767");
        return false;
    }

    public static boolean validateInputs(String num1, String num2, String operator) {
        if (!(isNumber(num1) && isNumber(num2))) {
            return false;
        }
        double converted_num1 = Double.parseDouble(num1);
        double converted_num2 = Double.parseDouble(num2);
        if (!(isWithinRange(converted_num1) && isWithinRange(converted_num2))) {
            return false;
        }
        if (!isOperator(operator)) {
            return false;
        }
        return true;
    }
}
