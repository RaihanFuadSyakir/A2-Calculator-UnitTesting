package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMultiply {
    @Test
    public void testMultiply() {
        assertEquals(225.0, Calculator.multiply(15, 15));
    }
}
