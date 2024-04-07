package main.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.java.Calculator;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(4.0, Calculator.add(2.0, 2.0), 0.001);
        assertEquals(-3.0, Calculator.add(-5.0, 2.0), 0.001);
        assertEquals(0.0, Calculator.add(0.0, 0.0), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(5.0, Calculator.subtract(8.0, 3.0), 0.001);
        assertEquals(-3.0, Calculator.subtract(2.0, 5.0), 0.001);
        assertEquals(0.0, Calculator.subtract(0.0, 0.0), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(15.0, Calculator.multiply(3.0, 5.0), 0.001);
        assertEquals(-15.0, Calculator.multiply(3.0, -5.0), 0.001);
        assertEquals(0.0, Calculator.multiply(0.0, 5.0), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculator.divide(6.0, 3.0), 0.001);
        assertEquals(-2.0, Calculator.divide(6.0, -3.0), 0.001);
        assertEquals(0.0, Calculator.divide(0.0, 5.0), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(5.0, 0.0), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(Double.NaN, Calculator.divide(5.0, 0.0), 0.001);
    }
}
