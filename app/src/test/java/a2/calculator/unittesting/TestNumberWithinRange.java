package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNumberWithinRange {
    @Test
    void testNumberWithin() {
        assertEquals(true, ValidationValue.isWithinRange(1));
    }

    @Test
    void testNumberOutsideRange() {
        assertEquals(false, ValidationValue.isWithinRange(160000));
    }
}
