package a2.calculator.unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumTest {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Test
    public void testInput() {
        assertEquals(isNumeric("22"), true);
        assertEquals(isNumeric("5.05"), true);
        assertEquals(isNumeric("-200"), true);
        assertEquals(isNumeric("10.0d"), true);
        assertEquals(isNumeric("   22   "), true);
    }
}
