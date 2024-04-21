package a2.calculator.unittesting;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestScanLine {
    @Test
    void testEmptyInput() {
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("", InputHandler.scanLine("Masukkan operand pertama: "));
    }

    @Test
    void testFilledInput() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("3", InputHandler.scanLine("Masukkan operand pertama: "));
    }
}
