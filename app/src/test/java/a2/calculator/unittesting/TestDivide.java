package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDivide {
    @Test
    void testValidDivison() {
        assertEquals(5.0, Calculator.divide(6, 3));
    }

    @Test
    void testInvalidDivisionNumberOutOfRange() {
        assertEquals(Double.NaN, Calculator.divide(33000, 2));
    }

    @Test
    void testInvalidDivisionDivideByZero() {
        assertEquals(Double.NaN, Calculator.divide(5, 0));
    }
}
