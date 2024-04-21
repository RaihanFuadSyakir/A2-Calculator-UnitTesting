package a2.calculator.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestIsOperator {
    @Test
    void testValidOperatorAddition() {
        assertEquals(true, ValidationValue.isOperator("+"));
    }

    @Test
    void testValidOperatorSubstraction() {
        assertEquals(true, ValidationValue.isOperator("-"));
    }

    @Test
    void testValidOperatorMultiply() {
        assertEquals(true, ValidationValue.isOperator("*"));
    }

    @Test
    void testValidOperatorDivison() {
        assertEquals(true, ValidationValue.isOperator("/"));
    }

    @Test
    void testInvalidOperator() {
        assertEquals(false, ValidationValue.isOperator("5"));
    }
}
