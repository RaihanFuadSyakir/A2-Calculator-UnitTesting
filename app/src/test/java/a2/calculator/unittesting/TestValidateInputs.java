package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestValidateInputs {
    @Test
    void testOperrandInputNotNumber() {
        assertEquals(false, ValidationValue.validateInputs("a", "1", "+"));
    }

    @Test
    void testOperrandInputOutsideRange() {
        assertEquals(false, ValidationValue.validateInputs("160000", "1", "+"));
    }

    @Test
    void testOperatorInputNotValid() {
        assertEquals(false, ValidationValue.validateInputs("1", "1", "a"));
    }

    @Test
    void testAllInputValid() {
        assertEquals(false, ValidationValue.validateInputs("1", "1", "+"));
    }
}
