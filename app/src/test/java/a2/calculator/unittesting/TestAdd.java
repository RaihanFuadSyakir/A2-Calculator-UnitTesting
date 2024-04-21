package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAdd {
    @Test
    public void testAdd() {
        assertEquals(7.0, Calculator.add(3, 4));
    }
}
