package a2.calculator.unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIsNumber {
    @Test
    void testInputIsNumber() {
        assertEquals(true, ValidationValue.isNumber("1"));
    }

    @Test
    void testInputNotNumber() {
        assertEquals(false, ValidationValue.isNumber("a"));
    }

    @Test
    void testInputEmptyNumber() {
        assertEquals(false, ValidationValue.isNumber(""));
    }
}
