package a2.calculator.unittesting;

import java.util.Scanner;

public class InputHandler {
    public static String scanLine(String message) {
        // membuat objek scanner untuk mengambil input
        Scanner scanner = new Scanner(System.in);
        String line = "";
        // tampilkan pesan instruksi apa yang akan diinput
        System.out.println(message);
        // membaca input satu line

        if (scanner.hasNextLine()) {
            line = scanner.nextLine();
        } else {
            scanner.close();
        }
        // return hasil input
        return line;
    }
}
