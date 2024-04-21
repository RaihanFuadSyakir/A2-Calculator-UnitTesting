package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSubsctraction {
    @Test
    void testValidSubstraction() {
        assertEquals(5.0, Calculator.subtract(8, 3));
    }

    @Test
    void testinValidSubstractionNumberOutOfRange() {
        assertEquals(Double.NaN, Calculator.subtract(33000, 1000));
    }
}
