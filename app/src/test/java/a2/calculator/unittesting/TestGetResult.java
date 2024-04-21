package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestGetResult {
    @Test
    void testGetResultAddition() {
        assertEquals(12.0, App.getResult(10, 2, "+"));
    }

    @Test
    void testGetResultSubstraction() {
        assertEquals(5.0, App.getResult(20, 15, "-"));
    }

    @Test
    void testGetResultMultiply() {
        assertEquals(50.0, App.getResult(25, 2, "*"));
    }

    @Test
    void testGetResultDivision() {
        assertEquals(7.5, App.getResult(15, 2, "/"));
    }

    @Test
    void testGetResultOperationNotValid() {
        assertEquals(Double.NaN, App.getResult(12, 12, "5"));
    }
}
